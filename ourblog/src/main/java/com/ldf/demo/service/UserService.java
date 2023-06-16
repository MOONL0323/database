package com.ldf.demo.service;

import com.ldf.demo.pojo.User;
import com.ldf.demo.utils.MD5Utils;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
public interface UserService {
    User checkUsernameAndPassword(String username, String password);
}
