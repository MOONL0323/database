package com.ldf.demo.service.impl;

import com.ldf.demo.mapper.UserMapper;
import com.ldf.demo.pojo.User;
import com.ldf.demo.service.UserService;
import com.ldf.demo.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUsernameAndPassword(String username, String password) {
        return userMapper.checkUsernameAndPassword(username, MD5Utils.code(password));
    }
}
