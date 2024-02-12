package com.xworkz.database3.service;

import com.xworkz.database3.dto.FlightBooking;

import java.util.List;

public interface FlightBookingService {
    void save(FlightBooking booking);

    void saveAll(List<FlightBooking> bookings);

    void update(String flightName,String source,String destination);
    FlightBooking findByName(String name);

    List<FlightBooking> selectAll();
}
