package com.xworkz.collection.lambdaexpression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EscalatorDTO implements Serializable {
    int speed;
    int capacity;
    int noOfSteps;
    int lenght;
}
