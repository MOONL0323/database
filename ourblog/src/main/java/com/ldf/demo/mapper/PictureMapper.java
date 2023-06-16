package com.ldf.demo.mapper;

import com.ldf.demo.pojo.Picture;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
@Repository
public interface PictureMapper {

    List<Picture> listPictures();

    int savePicture(Picture picture);

    Picture getPictureById(Long id);

    int updatePicture(Picture picture);

    void deletePicture(Long id);
}
