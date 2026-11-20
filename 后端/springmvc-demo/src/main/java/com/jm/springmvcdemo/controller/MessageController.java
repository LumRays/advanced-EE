package com.jm.springmvcdemo.controller;

import com.jm.springmvcdemo.entity.MessageInfo;
import com.jm.springmvcdemo.service.MessageWallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private MessageWallService messageWallService;

    public MessageController(MessageWallService messageWallService) {
        this.messageWallService = messageWallService;
    }

    @RequestMapping("/publish")
    public Boolean publish(@RequestBody MessageInfo messageInfo) {
        if (!StringUtils.hasLength(messageInfo.getFrom())
            || !StringUtils.hasLength(messageInfo.getTo())
            || !StringUtils.hasLength(messageInfo.getMessage())) {
            return false;
        }
        messageWallService.addMessage(messageInfo);
        return true;
    }

    @RequestMapping("/getList")
    public List<MessageInfo> getList() {
        return messageWallService.queryAllMessages();
    }

}
