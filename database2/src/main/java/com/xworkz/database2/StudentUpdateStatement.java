package com.xworkz.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdateStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";

        String sql="update student set id=101 where id=1";
        String sql1="update student set id=102 where id=2";
        String sql2="update student set id=103 where id=3";
        String sql3="update student set id=104 where id=4";
        String sql4="update student set id=105 where id=5";
        String sql5="update student set id=106 where id=6";
        String sql6="update student set id=107 where id=7";
        String sql7="update student set id=108 where id=8";
        String sql8="update student set id=110 where id=9";
        String sql9="update student set id=111 where id=10";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            Statement statement=connection.createStatement();
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
            System.out.println("updated success fully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
