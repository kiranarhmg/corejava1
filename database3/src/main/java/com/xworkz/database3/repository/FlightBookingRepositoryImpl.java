package com.xworkz.database3.repository;

import com.xworkz.database3.dto.FlightBooking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightBookingRepositoryImpl implements FlightBookingRepository{
    @Override
    public void saveFlightBookingDetails(FlightBooking booking) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="insert into airticket (flight_name,source,destination,price) values(?,?,?,?)";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,booking.getFlightName());
            preparedStatement.setString(2,booking.getSource());
            preparedStatement.setString(3,booking.getDestination());
            preparedStatement.setInt(4,booking.getPrice());
            preparedStatement.execute();

            System.out.println("inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void saveAll(List<FlightBooking> flightBookings) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="insert into airticket (flight_name,source,destination,price) values(?,?,?,?)";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            for (FlightBooking booking:flightBookings
                 ) {
                preparedStatement.setString(1,booking.getFlightName());
                preparedStatement.setString(2,booking.getSource());
                preparedStatement.setString(3,booking.getDestination());
                preparedStatement.setInt(4,booking.getPrice());
                preparedStatement.execute();

                System.out.println("inserted");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

    @Override
    public void update(String flightName, String source, String destination) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="update airticket set source=?,destination=? where flight_name=? ";

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
             preparedStatement.setString(1,source);
             preparedStatement.setString(2,destination);
             preparedStatement.setString(3,flightName);
            preparedStatement.executeUpdate();

            System.out.println("updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public FlightBooking findByName(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
      String sql="select * from airticket where flight_name=?";
      FlightBooking flightBooking=new FlightBooking("qa","blr","mn",3900);

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
           ResultSet resultSet=preparedStatement.executeQuery();
           if(resultSet.next())
           {
               System.out.println(resultSet.getString("source"));
               System.out.println(resultSet.getString("destination"));
               flightBooking.setFlightName(resultSet.getString("flight_name"));
               flightBooking.setDestination(resultSet.getString("destination"));
               flightBooking.setPrice(resultSet.getInt("price"));
               flightBooking.setSource(resultSet.getString("source"));

           }

            System.out.println("fetched successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flightBooking;
    }

    @Override
    public List<FlightBooking> findAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/ticketsystem";
        String user="root";
        String pass="Xworkzodc@123";
        String sql="select * from airticket";
     List<FlightBooking> flightBookings=new ArrayList<>();

        try {
            Connection connection= DriverManager.getConnection(url,user,pass);
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("source"));
                System.out.println(resultSet.getString("destination"));
              FlightBooking flightBooking=new FlightBooking("airmalasia","blr","msr",3000);
              flightBooking.setSource(resultSet.getString("source"));
              flightBooking.setFlightName(resultSet.getString("flight_name"));
              flightBooking.setDestination(resultSet.getString("destination"));
              flightBooking.setPrice(resultSet.getInt("price"));
              flightBookings.add(flightBooking);

            }

            System.out.println("fetched successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flightBookings;
    }


}
