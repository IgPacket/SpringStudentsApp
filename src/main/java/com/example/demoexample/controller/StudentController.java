package com.example.demoexample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoexample.model.Student;
import com.example.demoexample.service.StudentService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent() {
        //TODO
        return studentService.findAllStudent();
    }

    @PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    

}
