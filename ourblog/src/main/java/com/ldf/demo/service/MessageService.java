package com.ldf.demo.service;

import com.ldf.demo.pojo.Message;

import java.util.List;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
public interface MessageService {
    List<Message> listMessages();

    void saveMessage(Message message);

    void deleteMessage(Long id);
}
