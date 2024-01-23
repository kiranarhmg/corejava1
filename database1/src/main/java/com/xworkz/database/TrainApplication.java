package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainApplication {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        String url="jdbc:mysql://localhost:3306/bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String sql="INSERT INTO Train VALUES (1, 'Shatabdi Express', 'Delhi', 'Mumbai')";
        String sql1="INSERT INTO Train VALUES (2, 'Rajdhani Express', 'Kolkata', 'Delhi')";
        String sql2="INSERT INTO Train VALUES (3, 'Duronto Express', 'Chennai', 'Hyderabad')";
        String sql3="INSERT INTO Train VALUES (4, 'Gatimaan Express', 'Agra', 'Delhi')";
        String sql4="INSERT INTO Train VALUES (5, 'Humsafar Express', 'Pune', 'Jaipur')";
        String sql5="INSERT INTO Train VALUES (6, 'Tejas Express', 'Ahmedabad', 'Mumbai')";
        String sql6="INSERT INTO Train VALUES (7, 'Garib Rath', 'Bengaluru', 'Chennai')";
        String sql7="INSERT INTO Train VALUES (8, 'Sampark Kranti', 'Patna', 'New Delhi')";
        String sql8="INSERT INTO Train VALUES (9, 'Superfast Express', 'Lucknow', 'Kanpur')";
        String sql9="INSERT INTO Train VALUES (10, 'Jan Shatabdi', 'Jaipur', 'Ajmer')";




        try {
          Connection connection= DriverManager.getConnection(url,userName,password);
           Statement statement =connection.createStatement();
            statement.execute(sql);
            statement.execute(sql1);
            statement.execute(sql2);
            statement.execute(sql3);
            statement.execute(sql4);
            statement.execute(sql5);
            statement.execute(sql6);
            statement.execute(sql7);
            statement.execute(sql8);
            statement.execute(sql9);
            System.out.println("inserted successfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
