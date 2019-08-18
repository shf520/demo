package com.example.demo.controller;

import com.example.demo.entity.StudentConfig;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("/register")
    public String registerStudent(@NotNull String name, @NotNull int age) {
        String msg = "success";

        try {
            studentService.registerStudent(new StudentConfig(name, age));
        } catch (Exception e) {
            msg = "error";
        }

        return msg;

    }

}
