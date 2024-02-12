package com.xworkz.database3.repository;

import com.xworkz.database3.dto.StudentRegister;

import java.sql.*;
import java.util.List;

public class StudentRegisterImpl implements StudentRegisterRepository{

    @Override
    public void addStudent(StudentRegister studentRegister) {
        StudentRegisterRepository studentRegisterRepository=new StudentRegisterImpl();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="insert into studentregister values(?,?,?)";

        try {
          Connection connection= DriverManager.getConnection(url,user,pass);
        PreparedStatement preparedStatement= connection.prepareStatement(sql);
        preparedStatement.setInt(1,studentRegister.getId());
        preparedStatement.setString(2,studentRegister.getName());
        preparedStatement.setString(3,studentRegister.getCourse());
        preparedStatement.executeUpdate();
            System.out.println("inserted successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addAllStudents(List<StudentRegister> studentRegisters) {
        StudentRegisterRepository studentRegisterRepository=new StudentRegisterImpl();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="insert into studentregister values(?,?,?)";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            for (StudentRegister student:studentRegisters) {
                preparedStatement.setInt(1,student.getId());
                preparedStatement.setString(2,student.getName());
                preparedStatement.setString(3,student.getCourse());
                preparedStatement.executeUpdate();
                System.out.println("inserted successfully..........");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAll(List<StudentRegister> studentRegisters) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="update studentregister set branch=? where id=?";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            for (StudentRegister student:studentRegisters
                 ) {
                preparedStatement.setString(1,student.getCourse());
                preparedStatement.setInt(2,student.getId());
                preparedStatement.executeUpdate();
                System.out.println("updated successfully.....");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public StudentRegister selectAll(List<StudentRegister> studentRegisters) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="select * from studentregister where name=?";
        ResultSet resultSet=null;
        StudentRegister studentRegister=new StudentRegister(10,"ma","karthi");

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            for (StudentRegister student:studentRegisters
            ) {
                preparedStatement.setString(1,student.getName());

             resultSet= preparedStatement.executeQuery();

            while (resultSet.next())
            {

                studentRegister.setName(resultSet.getString("name"));
                studentRegister.setId(resultSet.getInt("id"));
                 studentRegister.setCourse(resultSet.getString("branch"));

            }
                System.out.println("fetched successfully.....");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentRegister;
    }
}
