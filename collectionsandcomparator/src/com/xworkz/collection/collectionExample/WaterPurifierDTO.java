package com.xworkz.collection.collectionExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@ToString
@Setter
@Getter
public class WaterPurifierDTO implements Serializable {
    String brand;
    int capacity;
    int cost;
    String color;
}
