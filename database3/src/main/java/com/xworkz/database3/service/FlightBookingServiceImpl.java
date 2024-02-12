package com.xworkz.database3.service;

import com.xworkz.database3.dto.FlightBooking;
import com.xworkz.database3.repository.FlightBookingRepository;
import com.xworkz.database3.repository.FlightBookingRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class FlightBookingServiceImpl implements FlightBookingService {
    FlightBookingRepository flightBookingRepository = new FlightBookingRepositoryImpl();

    @Override
    public void save(FlightBooking booking) {
        if (booking.getFlightName().isEmpty()) {
            System.out.println("please enter valid flight name");
        } else {
            flightBookingRepository.saveFlightBookingDetails(booking);
        }
    }

    @Override
    public void saveAll(List<FlightBooking> bookings) {
        FlightBookingRepository flightBookingRepository1 = new FlightBookingRepositoryImpl();
        for (FlightBooking booking : bookings) {
            if (booking.getFlightName().isEmpty()) {
                System.out.println("enter flight name");
            } else {
                flightBookingRepository1.saveAll(bookings);
            }
        }
    }

    @Override
    public void update(String flightName, String source, String destination) {
        FlightBookingRepository flightBookingRepository1 = new FlightBookingRepositoryImpl();
        if (flightName == null || flightName.isEmpty()) {
            System.out.println("please enter correct data");
        } else {
            flightBookingRepository1.update(flightName, source, destination);
        }
    }

    @Override
    public FlightBooking findByName(String name) {
        FlightBookingRepository flightBookingRepository = new FlightBookingRepositoryImpl();

        if (name == null) {
            System.out.println("enter flight name");
        } else {
            FlightBooking flightBooking = flightBookingRepository.findByName(name);
            return flightBooking;
        }
        return null;
    }

    @Override
    public List<FlightBooking> selectAll() {
        FlightBookingRepository flightBookingRepository1=new FlightBookingRepositoryImpl();
        List<FlightBooking> flightBookings=flightBookingRepository1.findAll();
        return flightBookings;
    }


}
