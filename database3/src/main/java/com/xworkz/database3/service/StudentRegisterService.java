package com.xworkz.database3.service;

import com.xworkz.database3.dto.StudentRegister;

import java.util.List;

public interface StudentRegisterService {
    void addStudent(StudentRegister register);

    void addAllStudents(List<StudentRegister> registers);

    void updateAll(List<StudentRegister> studentRegisters);


}
