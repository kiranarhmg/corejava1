package com.collection.example.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class LocationDTO {
    private String address;
    private int pinCode;
}
