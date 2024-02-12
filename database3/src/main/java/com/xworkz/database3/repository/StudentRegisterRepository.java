package com.xworkz.database3.repository;

import com.xworkz.database3.dto.StudentRegister;

import java.util.List;

public interface StudentRegisterRepository {

    void addStudent(StudentRegister studentRegister);
    void addAllStudents(List<StudentRegister> studentRegisters);

    void updateAll(List<StudentRegister> studentRegisters);
    StudentRegister selectAll(List<StudentRegister> studentRegisters);

}
