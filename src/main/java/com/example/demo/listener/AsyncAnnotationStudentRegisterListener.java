package com.example.demo.listener;

import com.example.demo.event.StudentRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncAnnotationStudentRegisterListener {

    @EventListener
    @Async
    public void sendMailToStudent(StudentRegisterEvent studentRegisterEvent) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("利用@EventListener注解监听用户注册事件并异步向用户发送邮件");
        System.out.println("异步监听，注册用户名：" + studentRegisterEvent.getStudentConfig().getName());
    }
}
