package com.xworkz.database;

import java.sql.*;

public class TrainApplicationWithPreparedStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/bankapplication";
        String userName = "root";
        String password = "Xworkzodc@123";
        String sql = "select * from train";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);

            preparedStatement = connection.prepareStatement(sql);
           
            ResultSet re = preparedStatement.executeQuery();
            while (re.next()) {
                System.out.println(re.getInt("trainid"));
            }
            System.out.println("inserted successfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
