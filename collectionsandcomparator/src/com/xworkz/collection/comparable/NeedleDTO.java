package com.xworkz.collection.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class NeedleDTO implements Serializable,Comparable<NeedleDTO> {
    String brand;
    int cost;
    int height;


    @Override
    public int compareTo(NeedleDTO o) {
        return this.brand.compareTo(o.getBrand());
    }
}
