package com.xworkz.database2;

import java.sql.*;

public class StudentFetchStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="select * from student";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            Statement statement=connection.createStatement();
          ResultSet rs= statement.executeQuery(sql);
          while (rs.next())
          {
              System.out.println(rs.getInt("id"));
          }

            System.out.println("fetched successfully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
