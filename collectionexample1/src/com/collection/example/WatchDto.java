package com.collection.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Setter
@Getter
@ToString
public class WatchDto implements Serializable,Comparable<WatchDto>{
    private String brand;
    private int cost;
    private String color;
    private String country;

   @Override
    public int compareTo(WatchDto o) {
        return this.brand.compareTo(o.getBrand());
    }
}
