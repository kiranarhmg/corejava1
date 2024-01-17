package com.xworkz.collection.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Setter
@Getter
@ToString
public class RopeDTO implements Serializable,Comparable<RopeDTO> {
    int width;
    int height;
    int cost;

    @Override
    public int compareTo(RopeDTO o) {
        return Double.compare(this.cost,o.getCost());
    }
}
