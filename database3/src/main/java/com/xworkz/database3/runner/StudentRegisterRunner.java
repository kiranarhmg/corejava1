package com.xworkz.database3.runner;

import com.xworkz.database3.dto.StudentRegister;
import com.xworkz.database3.service.StudentRegisterService;
import com.xworkz.database3.service.StudentRegisterServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentRegisterRunner {
    public static void main(String[] args) {
        StudentRegister studentRegister=new StudentRegister(1,"mca","kiran");
        StudentRegisterService service=new StudentRegisterServiceImpl();
/*
        service.addStudent(studentRegister);
*/
        List<StudentRegister> list=new ArrayList<>();
        StudentRegister studentRegister1=new StudentRegister(1,"bca","pavan");
        StudentRegister studentRegister2=new StudentRegister(3,"bcom","kumar");
      list.add(studentRegister1);
        list.add(studentRegister2);

       /* service.addAllStudents(list);*/

       /* service.updateAll(list);*/





    }
}
