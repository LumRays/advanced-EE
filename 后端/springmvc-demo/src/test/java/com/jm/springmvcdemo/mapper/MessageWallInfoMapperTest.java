package com.jm.springmvcdemo.mapper;

import com.jm.springmvcdemo.entity.MessageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageWallInfoMapperTest {

    @Autowired
    private MessageWallInfoMapper messageWallInfoMapper;

    @Test
    void insertMessage() {

        MessageInfo messageInfo = new MessageInfo();
        messageInfo.setFrom("张飞");
        messageInfo.setTo("曹操");
        messageInfo.setMessage("干就完了!");
        messageWallInfoMapper.insertMessage(messageInfo);
    }

    @Test
    void searchMessages() {

        List<MessageInfo> messageInfos = messageWallInfoMapper.searchMessages();
        System.out.println(messageInfos);

    }
}