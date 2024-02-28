package com.collection.example.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CapitalDTO {
    private String name;
    private double area;
    private double population;
}
