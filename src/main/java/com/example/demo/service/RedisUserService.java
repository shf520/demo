package com.example.demo.service;

import com.example.demo.entity.User;

/*
 * redis服务接口
 */
public interface RedisUserService {

    /**
     * 根据用户uuid获取用户信息
     *
     * @param id
     * @return
     */
    User getUserInfo(int id);

    /**
     * 将用户信息存入Redis
     *
     * @param user
     */
    void saveUserInfo(User user);

}
