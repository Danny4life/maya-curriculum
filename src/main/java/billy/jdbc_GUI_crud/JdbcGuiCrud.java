package billy.jdbc_GUI_crud;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class JdbcGuiCrud {

    /**
     * CREATE DATABASE testdb;
     * USE testdb;
     * CREATE TABLE users (
     *     id INT PRIMARY KEY AUTO_INCREMENT,
     *     name VARCHAR(100),
     *     age INT
     * );
     */

    private static final String URL = "jdbc:mysql://localhost:3306/guiDB";
    private static final String USER = "root";
    private static final String PASSWORD = "PASSword1234!#";

    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField nameField, ageField, idField;

    public JdbcGuiCrud() {
        frame = new JFrame("User Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Age"}, 0);
        table = new JTable(tableModel);
        refreshTable();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("ID (For Update/Delete):"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        JButton insertButton = new JButton("Insert");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        insertButton.addActionListener(e -> insertUser());
        updateButton.addActionListener(e -> updateUser());
        deleteButton.addActionListener(e -> deleteUser());

        panel.add(insertButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void refreshTable() {
        tableModel.setRowCount(0);
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getInt("age")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertUser() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO users (name, age) VALUES (?, ?)") ) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            refreshTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    private void viewUsers() {
//        executeQuery("SELECT * FROM users");
//    }

    private void updateUser() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("UPDATE users SET name = ?, age = ? WHERE id = ?")) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            refreshTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteUser() {
        int id = Integer.parseInt(idField.getText());
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM users WHERE id = ?")) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            refreshTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    private void searchUser() {
//        String name = searchField.getText();
//        executeQuery("SELECT * FROM users WHERE name LIKE ?", "%" + name + "%");
//    }

//    private void executeUpdate(String sql, Object... params) {
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            for (int i = 0; i < params.length; i++) {
//                stmt.setObject(i + 1, params[i]);
//            }
//            stmt.executeUpdate();
//            resultArea.setText("Operation successful!");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }

//    private void executeQuery(String sql, Object... params) {
//        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//             PreparedStatement stmt = conn.prepareStatement(sql)) {
//            for (int i = 0; i < params.length; i++) {
//                stmt.setObject(i + 1, params[i]);
//            }
//            ResultSet rs = stmt.executeQuery();
//            StringBuilder result = new StringBuilder();
//            while (rs.next()) {
//                result.append("ID: ").append(rs.getInt("id"))
//                        .append(", Name: ").append(rs.getString("name"))
//                        .append(", Age: ").append(rs.getInt("age"))
//                        .append("\n");
//            }
//            resultArea.setText(result.toString());
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JdbcGuiCrud::new);
    }

}
