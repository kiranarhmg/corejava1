package com.xworkz.collection.collectionExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SensorDto implements Serializable {
    private String name;
    private String type;
    private double cost;
    private int distance;

}
