package com.xworkz.database.service;

import com.xworkz.database.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    void add(EmployeeDto employeeDto);
void addAll(List<EmployeeDto> employeeDtos);
void selectAll(List<EmployeeDto> employeeDtos);
    void update(EmployeeDto employeeDto);
List<EmployeeDto> selectTotal();

}
