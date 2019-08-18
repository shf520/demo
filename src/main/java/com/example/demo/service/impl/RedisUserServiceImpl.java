package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.RedisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service("redisUserService")
public class RedisUserServiceImpl implements RedisUserService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public User getUserInfo(int id) {
        return (User) redisTemplate.opsForValue().get(id);
    }

    @Override
    public void saveUserInfo(User user) {
        redisTemplate.opsForValue().set(user.getId(), user);
    }

}
