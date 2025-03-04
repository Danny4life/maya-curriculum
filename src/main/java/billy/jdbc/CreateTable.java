package billy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testJDB";
        String username = "root";
        String password = "PASSword1234!#";

        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement()){

            String sql = "CREATE TABLE Users_tbl  (ID INT PRIMARY KEY, Name VARCHAR(5), Balance Double)";

            stm.executeUpdate(sql);
            System.out.println("Table create successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
