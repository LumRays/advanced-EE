package com.jm.springmvcdemo.service;

import com.jm.springmvcdemo.entity.MessageInfo;
import com.jm.springmvcdemo.mapper.MessageWallInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageWallService {

    @Autowired
    private MessageWallInfoMapper messageWallInfoMapper;

    public void addMessage(MessageInfo messageInfo) {

        messageWallInfoMapper.insertMessage(messageInfo);

    }

    public List<MessageInfo> queryAllMessages() {

        return messageWallInfoMapper.searchMessages();

    }

}
