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
public class WingsDTO implements Serializable,Comparable<WingsDTO> {

    int width;
    int cost;
    String color;

    @Override
    public int compareTo(WingsDTO o) {
        return Double.compare(this.width,o.getWidth());
    }
}
