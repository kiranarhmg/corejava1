package com.xworkz.database.runner;

import com.xworkz.database.dto.EmployeeDto;
import com.xworkz.database.service.EmployeeService;
import com.xworkz.database.service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDto employeeDto=new EmployeeDto(1,"kiran",50000);
        EmployeeService employeeService=new EmployeeServiceImpl();
       /* employeeService.add(employeeDto);*/

        EmployeeDto employeeDto1=new EmployeeDto(2,null,60000);
        EmployeeDto employeeDto2=new EmployeeDto(3,"karan",70000);
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        employeeDtos.add(employeeDto1);
        employeeDtos.add(employeeDto2);

      /*  employeeService.addAll(employeeDtos);*/
//             employeeService.selectAll(employeeDtos);

             EmployeeDto employeeDto3 = new EmployeeDto(2,"kumar",100000);

             /*employeeService.update(employeeDto3);
*/

        List<EmployeeDto> list=employeeService.selectTotal();
        list.forEach(ref->{
            System.out.println(ref.getId());
            System.out.println(ref.getName());
            System.out.println(ref.getSalary());
        });
    }
}
