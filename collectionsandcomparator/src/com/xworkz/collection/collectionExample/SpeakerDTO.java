package com.xworkz.collection.collectionExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class SpeakerDTO implements Serializable {
    String brand;
    int cost;
    String color;
    double size;
}
