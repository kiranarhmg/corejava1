package com.xworkz.collection.lambdaexpression;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@ToString
@Setter
@Getter
public class StreetDTO implements Serializable {
    String name;
    int width;
    int distance;
    String type;

}
