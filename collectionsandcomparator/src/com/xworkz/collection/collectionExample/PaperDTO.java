package com.xworkz.collection.collectionExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@AllArgsConstructor
@Setter
@Getter
public class PaperDTO implements Serializable {
    int cost;
    double weight;
    String color;
    int height;
}
