package com.xworkz.database3.repository;

import com.xworkz.database3.dto.FlightBooking;

import java.util.List;

public interface FlightBookingRepository {
    public void saveFlightBookingDetails(FlightBooking booking);
    void saveAll(List<FlightBooking> flightBookings);

    void update(String flightName,String source,String destination);
    FlightBooking findByName(String name);

    List<FlightBooking> findAll();

}
