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
public class CardBoardDTO implements Serializable,Comparable<CardBoardDTO> {
    int cost;
    String color;
    int size;
    @Override
    public int compareTo(CardBoardDTO o) {
        return Double.compare(this.size,o.getSize());
    }
}
