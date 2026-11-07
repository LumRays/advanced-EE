package com.jm.mybatisdemo.controller;

import com.jm.mybatisdemo.entity.UserInfo;
import com.jm.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<UserInfo> getAllUser() {

        return userService.getAllUser();

    }

}
