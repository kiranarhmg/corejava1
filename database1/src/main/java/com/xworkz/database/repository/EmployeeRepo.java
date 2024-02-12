package com.xworkz.database.repository;

import com.xworkz.database.dto.EmployeeDto;

import java.util.List;

public interface EmployeeRepo {
    void add(EmployeeDto employeeDto);
    void addAll(List<EmployeeDto> employeeDtos);

    void update(EmployeeDto employeeDto);
    void selectAll(List<EmployeeDto> employeeDtos);

    List<EmployeeDto> selectTotal();
}
