package com.jm.springiocdemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public String test() {
        return "hello userController";
    }

}
