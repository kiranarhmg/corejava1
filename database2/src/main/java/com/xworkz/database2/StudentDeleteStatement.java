package com.xworkz.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDeleteStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="delete from student where id=101";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            Statement statement=connection.createStatement();
            statement.execute(sql);

            System.out.println("deleted success fully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
