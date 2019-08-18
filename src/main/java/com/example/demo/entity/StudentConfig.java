package com.example.demo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class StudentConfig {
    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    public StudentConfig() {

    }

    public StudentConfig(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
