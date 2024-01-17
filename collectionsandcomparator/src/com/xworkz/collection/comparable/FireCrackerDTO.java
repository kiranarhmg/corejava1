package com.xworkz.collection.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class FireCrackerDTO implements Serializable,Comparable<FireCrackerDTO> {

    String brand;
    String color;
    int cost;

    @Override
    public int compareTo(FireCrackerDTO o) {
        return this.brand.compareTo(o.getBrand());
    }
}
