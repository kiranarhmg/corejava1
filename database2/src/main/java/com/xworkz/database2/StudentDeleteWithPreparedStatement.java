package com.xworkz.database2;

import java.sql.*;

public class StudentDeleteWithPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="delete from bank where  branch=? and location=?";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setString(1,"vidyanagar");
            preparedStatement.setString(2,"mysore");
          preparedStatement.addBatch();


            preparedStatement.setString(1,"btm");
            preparedStatement.setString(2,"bangalore");
            preparedStatement.addBatch();

            preparedStatement.executeBatch();



            System.out.println("deleted successfully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
