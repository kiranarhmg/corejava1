package com.xworkz.database2;

import java.sql.*;

public class BankUpdateWithPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="update bank set branch=? where location=? and ifsc=?";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
           PreparedStatement preparedStatement=connection.prepareStatement(sql);
          preparedStatement.setString(1,"vijayanagar");
          preparedStatement.setString(2,"bangalore");
          preparedStatement.setString(3,"sbi1001");
          preparedStatement.addBatch();

            preparedStatement.setString(1,"majestic");
            preparedStatement.setString(2,"bangalore");
            preparedStatement.setString(3,"ka1001");
            preparedStatement.addBatch();

            preparedStatement.executeBatch();



            System.out.println("updated successfully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
