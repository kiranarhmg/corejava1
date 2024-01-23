package com.xworkz.database;

import java.sql.*;

public class BankApplication {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            throw new RuntimeException();
        }

        String url="jdbc:mysql://localhost:3306/bankapplication";
        String userName="root";
        String password="Xworkzodc@123";
        String sql="insert into bank values(1,'sbi','sbi0006')";
        String sql1="select * from bank";

        try {
          Connection connection= DriverManager.getConnection(url,userName,password);
            Statement statement=connection.createStatement();
            boolean result=statement.execute(sql);
           boolean rs= statement.execute(sql1);
            System.out.println("connected successfully");
            System.out.println("inserted data into bank");
            System.out.println(result);
            System.out.println(rs);
            ResultSet rs1=statement.getResultSet();
            System.out.println(rs1);
           
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
