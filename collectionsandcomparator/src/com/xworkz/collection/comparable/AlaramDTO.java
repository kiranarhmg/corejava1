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

public class AlaramDTO implements Serializable,Comparable<AlaramDTO> {
    int cost;
    String brand;
    @Override
    public int compareTo(AlaramDTO alaramDTO) {
       return this.brand.compareTo(alaramDTO.getBrand());
    }
}

