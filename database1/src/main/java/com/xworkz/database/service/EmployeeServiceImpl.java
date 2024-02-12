package com.xworkz.database.service;

import com.xworkz.database.dto.EmployeeDto;
import com.xworkz.database.repository.EmployeeRepo;
import com.xworkz.database.repository.EmployeeRepoImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public void add(EmployeeDto employeeDto) {
        EmployeeRepo employeeRepo=new EmployeeRepoImpl();
        if(employeeDto.getId()==0 || employeeDto.getName().isEmpty()||employeeDto.getName()==null)
        {
            System.out.println("enter data correctly");
        }
        else {
            employeeRepo.add(employeeDto);
        }
    }

    @Override
    public void addAll(List<EmployeeDto> employeeDtos) {
        EmployeeRepo employeeRepo=new EmployeeRepoImpl();
        for (EmployeeDto emp:employeeDtos
             ) {
            if(emp.getId()==0 || emp.getName()==null)
            {
                System.out.println("enter data correctly...");
            }
        }
        employeeRepo.addAll(employeeDtos);
    }

    @Override
    public void selectAll(List<EmployeeDto> employeeDtos) {
        EmployeeRepo employeeRepo=new EmployeeRepoImpl();
        for (EmployeeDto emp:employeeDtos
        ) {
            if(emp.getId()==0 || emp.getName()==null || emp.getName().isEmpty())
            {
                System.out.println("enter data correctly to fetch...");
            }

        }
        employeeRepo.selectAll(employeeDtos);
    }

    @Override
    public void update(EmployeeDto employeeDto) {
        EmployeeRepo employeeRepo = new EmployeeRepoImpl();
        if (employeeDto.getSalary()==0){
            System.out.println("enter proper salary");
        }
        else {
            employeeRepo.update(employeeDto);
        }
    }

    @Override
    public List<EmployeeDto> selectTotal() {
        EmployeeRepo employeeRepo=new EmployeeRepoImpl();
        List<EmployeeDto> employeeDto=employeeRepo.selectTotal();
        return employeeDto;
    }
}
