package com.ldf.demo.service;

import com.ldf.demo.pojo.Type;

import java.util.List;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
public interface TypeService {

    List<Type> listTypes();

    Type getType(Long typeId);

    List<Type> getAlltype();

    int saveType(Type type);

    Type getTypeByName(String name);

    int updateType(Type type);

    int deleteById(Long id);

    List<Type> listTypesAndBlogs();

}
