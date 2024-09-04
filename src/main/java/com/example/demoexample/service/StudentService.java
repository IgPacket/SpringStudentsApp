package com.example.demoexample.service;

import java.util.List;

import com.example.demoexample.model.Student;

public interface StudentService {
    
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
