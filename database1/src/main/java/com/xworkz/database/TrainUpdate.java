package com.xworkz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String sql="update train set  TrainID=11 where  TrainID=1";
        String sql1="update train set  TrainID=12 where  TrainID=2";
        String sql2="update train set  TrainID=13 where  TrainID=3";
        String sql3="update train set  TrainID=14 where  TrainID=4";
        String sql4="update train set  TrainID=15 where  TrainID=5";
        String sql5="update train set  TrainID=16 where  TrainID=6";
        String sql6="update train set  TrainID=17 where  TrainID=7";
        String sql7="update train set  TrainID=18 where  TrainID=8";
        String sql8="update train set  TrainID=19 where  TrainID=9";
        String sql9="update train set  TrainID=10 where  TrainID=10";
        try {
            Connection connection= DriverManager.getConnection(url,userName,password);
            Statement statement =connection.createStatement();
            statement.execute(sql);
            statement.execute(sql1);
            statement.execute(sql2);
            statement.execute(sql3);
            statement.execute(sql4);
            statement.executeUpdate(sql5);
            statement.executeUpdate(sql6);
            statement.executeUpdate(sql7);
            statement.executeUpdate(sql8);
            statement.executeUpdate(sql9);
            System.out.println("updated successfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
