package com.collection.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PlayGroundDto implements Serializable,Comparable<PlayGroundDto> {
    private String groundName;
    private  double area;
    private int width;
    private String location;

    @Override
    public int compareTo(PlayGroundDto o) {
        return Double.compare(this.area,o.getArea());
    }
}
