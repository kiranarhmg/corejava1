package com.xworkz.database3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class StudentRegister {

    private int id;
    private String course;
    private String name;
}
