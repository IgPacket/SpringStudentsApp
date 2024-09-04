package com.example.demoexample.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    @NonNull
    private String email;
    private int age;
}
