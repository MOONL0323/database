package com.ldf.demo.mapper;

import com.ldf.demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
@Repository
public interface UserMapper {

    User checkUsernameAndPassword(@Param("username") String username,@Param("password") String password);

}
