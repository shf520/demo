package com.example.demo.service.impl;

import com.example.demo.entity.StudentConfig;
import com.example.demo.event.StudentRegisterEvent;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private ApplicationContext applicationContext;

    /*
     * 用户注册
     */
    @Override
    public void registerStudent(StudentConfig studentConfig) {
        if (studentConfig != null) {
            //调用持久层注册用户

            //发布用户注册事件
            applicationContext.publishEvent(new StudentRegisterEvent(this, studentConfig));
        }

    }
}
