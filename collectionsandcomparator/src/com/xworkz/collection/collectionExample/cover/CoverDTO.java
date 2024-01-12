package com.xworkz.collection.collectionExample.cover;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CoverDTO implements Serializable {
    int size;
    String color;
    int capacity;
    String brand;
}
