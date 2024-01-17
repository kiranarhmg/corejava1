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
public class ToyDTO implements Serializable,Comparable<ToyDTO> {
    String name;
    int cost;
    char size;

    @Override
    public int compareTo(ToyDTO o) {
        return Double.compare(this.cost,o.getCost());
    }
}
