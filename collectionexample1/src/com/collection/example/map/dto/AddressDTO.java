package com.collection.example.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class AddressDTO {
    private String area;
    private int pincode;
    private String location;
}
