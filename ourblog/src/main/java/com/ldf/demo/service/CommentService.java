package com.ldf.demo.service;

import com.ldf.demo.pojo.Comment;

import java.util.List;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long id);

    void saveComment(Comment comment);

    void deleteComment(Comment comment, Long id);
}
