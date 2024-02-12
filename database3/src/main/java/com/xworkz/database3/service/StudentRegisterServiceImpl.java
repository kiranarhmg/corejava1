package com.xworkz.database3.service;

import com.xworkz.database3.dto.StudentRegister;
import com.xworkz.database3.repository.StudentRegisterImpl;
import com.xworkz.database3.repository.StudentRegisterRepository;

import java.util.List;

public class StudentRegisterServiceImpl implements StudentRegisterService{
    StudentRegisterRepository studentRegisterRepository=new StudentRegisterImpl();
    @Override
    public void addStudent(StudentRegister register) {

        if(register.getName().isEmpty() || register.getId()==0)
        {
            System.out.println("enter valid student name or id");
        }
        else {
            studentRegisterRepository.addStudent(register);
        }
    }

    @Override
    public void addAllStudents(List<StudentRegister> registers) {

        boolean flag=true;
        for (StudentRegister student:registers) {
            if(student.getName().isEmpty()||student.getId()==0)
            {
                System.out.println("enter valid data");
                flag=false;
            }
        }
        if(flag==false)
        {
            return;
        }
        studentRegisterRepository.addAllStudents(registers);
    }

    @Override
    public void updateAll(List<StudentRegister> studentRegisters) {
        for (StudentRegister student:studentRegisters
             ) {
            if(student.getId()==0)
            {
                System.out.println("enter valid id");
            }
        }
        studentRegisterRepository.updateAll(studentRegisters);
    }



}
