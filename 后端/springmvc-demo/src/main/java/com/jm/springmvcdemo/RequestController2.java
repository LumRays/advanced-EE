package com.jm.springmvcdemo;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/request2")
public class RequestController2 {

    @RequestMapping("/getCookie")
    public String getCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for(Cookie cookie : cookies) {
                System.out.println(cookie.getName() + " = " + cookie.getValue());
            }
        }
        return "Cookie 获取成功";
    }

    @RequestMapping("/setSession")
    public String setSession(HttpServletRequest request) {
        // 获取 session
        HttpSession session = request.getSession();
        session.setAttribute("name", "小乔");
        session.setAttribute("age", 18);
        session.setAttribute("userInfo", new Person("小乔", 0, 18));
        return "设置 Session 成功!";
    }

    @RequestMapping("/getSession")
    public String getSession(HttpServletRequest request) {
        // 获取 session
        HttpSession session = request.getSession(false);
        if (session != null) {
            System.out.println("name : " + session.getAttribute("name"));
            System.out.println("userInfo : " + session.getAttribute("userInfo"));
        }
        return "获取 Session 成功!";
    }

    @RequestMapping("/getSession2")
    public String getSession2(@SessionAttribute("name") String name) {
        return "获取 Session 成功! name : " + name;
    }

    @RequestMapping("/getHeader")
    public String getHeader(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");
        return "userAgent: " + userAgent;
    }

    @RequestMapping("/getHeader2")
    public String getHeader2(@RequestHeader("User-Agent") String userAgent) {
        return "userAgent: " + userAgent;
    }

}
