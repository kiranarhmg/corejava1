package com.xworkz.collection.collectionExample.plug;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SparkPlugDTO implements Serializable {
    int cost;
    int quantity;
    String brand;
    int size;
}
