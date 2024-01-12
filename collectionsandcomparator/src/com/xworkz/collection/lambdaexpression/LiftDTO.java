package com.xworkz.collection.lambdaexpression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class LiftDTO implements Serializable {
    int capacity;
    int width;
    int height;
    int maxFloors;
}
