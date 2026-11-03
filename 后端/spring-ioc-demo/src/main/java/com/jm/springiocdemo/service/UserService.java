package com.jm.springiocdemo.service;

import com.jm.springiocdemo.entity.UserInfo;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //@Autowired
    @Resource(name = "userInfo1")
    private UserInfo info;

    public String test() {
        System.out.println(info);
        return "hello userService";
    }

}
