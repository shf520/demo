package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.RedisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private RedisUserService redisUserService;

    @RequestMapping("/saveUserInfoIntoRedis")
    public void saveUserInfoIntoRedis(int id, String name, Integer age) {
        User user = new User(id, name, age);
        user.setId(id);
        redisUserService.saveUserInfo(user);
    }

    @RequestMapping("/getUserInfoFromRedis")
    public User saveUserInfoIntoRedis(int id) {
        return redisUserService.getUserInfo(id);
    }


}
