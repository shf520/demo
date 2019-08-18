package com.example.demo.event;

import com.example.demo.entity.StudentConfig;
import org.springframework.context.ApplicationEvent;

public class StudentRegisterEvent extends ApplicationEvent {

    private StudentConfig studentConfig;

    /*
     * source表示事件源对象
     * studentConfig表示注册的学生对象
     */
    public StudentRegisterEvent(Object source, StudentConfig studentConfig) {
        super(source);
        this.studentConfig = studentConfig;
    }

    public StudentConfig getStudentConfig() {
        return studentConfig;
    }

    public void setStudentConfig(StudentConfig studentConfig) {
        this.studentConfig = studentConfig;
    }
}
