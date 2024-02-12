package com.xworkz.database.repository;

import com.xworkz.database.dto.EmployeeDto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo{
    @Override
    public void add(EmployeeDto employeeDto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String name="root";
        String pass="Xworkzodc@123";
        String sql="insert into emploee values(?,?,?)";

        try {
          Connection connection=  DriverManager.getConnection(url,name,pass);
          PreparedStatement preparedStatement=connection.prepareStatement(sql);
          preparedStatement.setInt(1,employeeDto.getId());
          preparedStatement.setString(2,employeeDto.getName());
          preparedStatement.setInt(3,employeeDto.getSalary());
          preparedStatement.execute();
            System.out.println("inserted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void addAll(List<EmployeeDto> employeeDtos) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String name="root";
        String pass="Xworkzodc@123";
        String sql="insert into emploee values(?,?,?)";

        try {
            Connection connection=  DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            for (EmployeeDto emp:employeeDtos
                 ) {
                preparedStatement.setInt(1,emp.getId());
                preparedStatement.setString(2,emp.getName());
                preparedStatement.setInt(3,emp.getSalary());
                preparedStatement.execute();
            }

            System.out.println("inserted successfully..........");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void update(EmployeeDto employeeDto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String name="root";
        String pass="Xworkzodc@123";
        String sql="update emploee set salary = ? where id = ?";

        try {
            Connection connection=  DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,employeeDto.getSalary());
            preparedStatement.setInt(2,employeeDto.getId());
            preparedStatement.execute();
            System.out.println("updated successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void selectAll(List<EmployeeDto> employeeDtos) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String name="root";
        String pass="Xworkzodc@123";
        String sql="select * from emploee where name=?";
        ResultSet resultSet=null;

        try {
            Connection connection=  DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            for (EmployeeDto emp:employeeDtos
                 ) {
                preparedStatement.setString(1,emp.getName());
                 resultSet=preparedStatement.executeQuery();
                while (resultSet.next())
                {
                    System.out.println(resultSet.getString("name"));
                    System.out.println(resultSet.getInt("id"));
                    System.out.println(resultSet.getInt("salary"));
                }

            }


            System.out.println("fetched successfully..........");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<EmployeeDto> selectTotal() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String uname="root";
        String pass="Xworkzodc@123";
        String sql="select * from emploee";
       List<EmployeeDto> employeeDtos=new ArrayList<>();

        try {
            Connection connection=DriverManager.getConnection(url,uname,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt("id"));
                EmployeeDto employeeDto=new EmployeeDto();
                employeeDto.setId(resultSet.getInt("id"));
                employeeDto.setName(resultSet.getString("name"));
                employeeDto.setSalary(resultSet.getInt("salary"));

                employeeDtos.add(employeeDto);

            }
            System.out.println("fetched successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeDtos;
    }
}
