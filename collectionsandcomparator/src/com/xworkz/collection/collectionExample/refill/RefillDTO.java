package com.xworkz.collection.collectionExample.refill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RefillDTO implements Serializable {
    String refillName;
    int size;
    int height;
    int cost;
}
