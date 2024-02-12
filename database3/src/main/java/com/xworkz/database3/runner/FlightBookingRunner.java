package com.xworkz.database3.runner;

import com.xworkz.database3.dto.FlightBooking;
import com.xworkz.database3.service.FlightBookingService;
import com.xworkz.database3.service.FlightBookingServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FlightBookingRunner {
    public static void main(String[] args) {
        List<FlightBooking> list=new ArrayList<>();
        FlightBooking flightBooking=new FlightBooking("","mangalore","uae",20000);
        FlightBooking flightBooking1=new FlightBooking("qutarairways","mangalore","uae",20000);

       /* list.add(flightBooking);
        list.add(flightBooking1);*/
        FlightBookingService flightBookingService=new FlightBookingServiceImpl();
 /*       flightBookingService.saveAll(list);*/

        /*flightBookingService.update(null,"bangalore","ayodhya");*/
/*
        FlightBooking booking=flightBookingService.findByName("airasia");

        if(booking==null)
        {
            System.out.println("there is no flight");
        }
        else {
            System.out.println("flight exist and name is: "+booking.getFlightName());
        }*/

         List<FlightBooking> flightBookingList=flightBookingService.selectAll();

      flightBookingList.forEach(booking -> {
          System.out.println(booking.getSource());
          System.out.println(booking.getDestination());
          System.out.println(booking.getFlightName());
      });
    }
}
