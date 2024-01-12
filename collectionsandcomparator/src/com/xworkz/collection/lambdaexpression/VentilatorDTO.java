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
public class VentilatorDTO implements Serializable {
    int cost;
    int maxPressure;
    int maxVolume;
    String model;
}
