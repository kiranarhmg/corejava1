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
public class ThreadDTO implements Serializable,Comparable<ThreadDTO> {
    int width;
    int length;
    int cost;

    @Override
    public int compareTo(ThreadDTO o) {
        return Double.compare(this.length,o.getLength());
    }
}
