package com.example.demoexample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoexample.controller.StudentController;
import com.example.demoexample.model.Student;

@SpringBootApplication
@RestController
public class DemoexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoexampleApplication.class, args);
	}
}
