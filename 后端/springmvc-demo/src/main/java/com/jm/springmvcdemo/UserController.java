package com.jm.springmvcdemo;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public Boolean login(String userName, String password, HttpSession session) {
        // 参数校验
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 判断账号和密码是否正确
        if ("admin".equals(userName) && "admin".equals(password)) {
            session.setAttribute("userName", userName);
            return true;
        }
        return false;
    }

    @RequestMapping("/getLoginUser")
    public String getLoginUser(HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        return userName == null ? "登录失败" : userName;
    }

}
