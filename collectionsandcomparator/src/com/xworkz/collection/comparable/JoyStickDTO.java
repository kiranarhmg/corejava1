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
public class JoyStickDTO implements Serializable,Comparable<JoyStickDTO> {
    String brand;
    int price;
    int size;

    @Override
    public int compareTo(JoyStickDTO o) {
        return Double.compare(this.price,o.getPrice());
    }
}
