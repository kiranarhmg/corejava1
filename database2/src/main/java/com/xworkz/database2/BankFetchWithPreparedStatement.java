package com.xworkz.database2;

import java.sql.*;

public class BankFetchWithPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="select * from bank where name=?";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"sbi");
          ResultSet rs= preparedStatement.executeQuery();
if(rs.next())
{
    System.out.println(rs.getString("name"));
}


            System.out.println("deleted successfully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
