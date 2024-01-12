package com.xworkz.collection.collectionExample.charcoal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class CharcoalDTO implements Serializable {
    int quantity;
    int price;
    String quality;
    String company;

}
