package com.jm.springlibrarydemo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public Boolean login(String name, String password) {
        // 参数校验
        if (!StringUtils.hasLength(name) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 判断账号和密码是否正确
        if ("admin".equals(name) && "admin".equals(password)) {
            return true;
        }
        return false;
        // 响应
    }
}
