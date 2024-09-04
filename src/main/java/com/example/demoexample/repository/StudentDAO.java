package com.example.demoexample.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.example.demoexample.model.Student;

@Repository
public class StudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();


    public List<Student> findAllStudent() {
        return STUDENTS;
    }


    public void deleteStudent(String email) {
        var student = findByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream()
            .filter(el -> el.getEmail().equals(email))
            .findFirst()
            .orElse(null);
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
            .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
            .findFirst()
            .orElse(-1);
            if (studentIndex > -1) {
                STUDENTS.set(studentIndex, student);
                return student;
            }
        return null;
    }
}
