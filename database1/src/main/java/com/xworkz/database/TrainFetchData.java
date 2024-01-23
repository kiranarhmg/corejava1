package com.xworkz.database;

import java.sql.*;

public class TrainFetchData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String sql="select * from train";

        Connection connection=null;
        Statement statement=null;
        try {
            connection= DriverManager.getConnection(url,userName,password);
            statement =connection.createStatement();
            ResultSet b= statement.executeQuery(sql);
          while (b.next())
          {
              System.out.println("train name: "+b.getString("TrainName")+" \n"+"train id: "+b.getInt("trainid")+" \n"+"departure city: "+b.getString("DepartureCity")+" \n"+"arrival city: "+b.getString("ArrivalCity"));

          }

            System.out.println("deleted successfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
