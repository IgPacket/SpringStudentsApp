package com.example.demoexample.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoexample.model.Student;
import com.example.demoexample.repository.StudentDAO;
import com.example.demoexample.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentDAO repository;
    
    @Override
    public List<Student> findAllStudent() {
        return List.of(
            Student.builder().name("Igor").email("mail").age(2).build(),
            Student.builder().name("Vova").email("mail").age(2).build(),
            Student.builder().name("Dima").email("mail").age(2).build()
        );
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
        
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }
    
}
