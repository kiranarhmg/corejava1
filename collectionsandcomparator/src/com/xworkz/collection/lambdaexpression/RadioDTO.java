package com.xworkz.collection.lambdaexpression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class RadioDTO implements Serializable {
    String name;
     double point;
     int invented;
     String country;

}
