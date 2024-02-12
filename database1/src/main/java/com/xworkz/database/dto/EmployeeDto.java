package com.xworkz.database.dto;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class EmployeeDto {
    private int id;
    private String name;
    private  int salary;
}
