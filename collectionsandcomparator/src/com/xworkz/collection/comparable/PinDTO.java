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
public class PinDTO implements Serializable,Comparable<PinDTO> {
    int height;
    int width;
    int sharpness;

    @Override
    public int compareTo(PinDTO o) {
        return Double.compare(this.sharpness,o.getSharpness());
    }
}
