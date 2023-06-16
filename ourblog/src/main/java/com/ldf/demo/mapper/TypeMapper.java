package com.ldf.demo.mapper;

import com.ldf.demo.pojo.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
@Repository
public interface TypeMapper {

    List<Type> listTypes();

    Type getType(Long typeId);

    int saveType(Type type);

    Type getTypeByName(String name);

    int updateType(Type type);

    int deleteById(Long id);

    List<Type> listTypesAndBlogs();

}
