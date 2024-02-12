package com.xworkz.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/studentapplication";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="insert into student values(1,'kiran','mca')";
        String sql1="insert into student values(2,'kumar','mba')";
        String sql2="insert into student values(3,'pavan','ma')";
        String sql3="insert into student values(4,'anil','mca')";
        String sql4="insert into student values(5,'ramesh','mcom')";
        String sql5="insert into student values(6,'manju','bca')";
        String sql6="insert into student values(7,'darshan','bcom')";
        String sql7="insert into student values(8,'raghu','bba')";
        String sql8="insert into student values(9,'krishna','llb')";
        String sql9="insert into student values(10,'karan','mcom')";
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
            System.out.println("inserted success fully");
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
