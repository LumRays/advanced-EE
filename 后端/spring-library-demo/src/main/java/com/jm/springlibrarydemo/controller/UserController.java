package com.jm.springlibrarydemo.controller;

import com.jm.springlibrarydemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Boolean login(String name, String password) {
        log.info("用户登录, 接收参数: name: {}", name);
        // 参数校验
        if (!StringUtils.hasLength(name) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 判断账号和密码是否正确
        Boolean result = userService.checkPassword(name, password);
        return result;
    }
}
