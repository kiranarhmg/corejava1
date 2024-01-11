package com.xworkz.collection.collectionExample.belt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class BeltDTO implements Serializable {
    String brand;
    int cost;
    int size;
    String color;
}
