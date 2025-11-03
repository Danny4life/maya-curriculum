package lenox.jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JavaDB";

        String username = "root";
        String password = "PASSword1234!#";

        try{
            // Register the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Create connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // 1 CREATE
//            int insert = statement.executeUpdate("INSERT INTO students VALUES (2, 'John', 'Doe', 'johns@gmail.com', '000000')");
//            System.out.println(insert + " record inserted");

            // 2. READ
//            ResultSet result = statement.executeQuery("SELECT * FROM students");
//
//            while (result.next()){
//                System.out.println(result.getInt(1) +
//                " " + result.getString(2) +
//                " " + result.getString(3) +
//                " " + result.getString(4));
//
//            }


            // 3. UPDATE
//            int update = statement.executeUpdate("UPDATE students SET first_name='Arya', last_name='Stark' WHERE student_id=1");
//            System.out.println(update + " record affected");


            // 4. DELETE
            int delete = statement.executeUpdate("DELETE FROM students WHERE student_id=1");

            System.out.println(delete + " record affected");



            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
