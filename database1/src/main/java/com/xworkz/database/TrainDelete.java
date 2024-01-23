package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String sql="delete from train where trainid=11";

        Connection connection=null;
        Statement statement=null;
        try {
            connection= DriverManager.getConnection(url,userName,password);
            statement =connection.createStatement();
           boolean b= statement.execute(sql);
            System.out.println(b);

            System.out.println("deleted successfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
