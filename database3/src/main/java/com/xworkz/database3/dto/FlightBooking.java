package com.xworkz.database3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class FlightBooking {
    private String flightName;
    private String source;
    private String destination;
    private int price;
}
