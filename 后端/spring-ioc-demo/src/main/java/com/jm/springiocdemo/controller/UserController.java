package com.jm.springiocdemo.controller;

import com.jm.springiocdemo.repository.UserRepository;
import com.jm.springiocdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // 属性注入
        @Autowired
        private UserService userService;
        @Autowired
        private UserRepository userRepository;

    // 构造方法注入
    //    private UserService userService;
    //    private UserRepository userRepository;
    //
    //    public UserController() {
    //        System.out.println("执行 UserController 无参构造方法!");
    //    }
    //
    //    //@Autowired
    //    public UserController(UserService userService) {
    //        System.out.println("执行 UserController 有参构造方法1!");
    //        this.userService = userService;
    //    }
    //
    //    @Autowired
    //    public UserController(UserService userService, UserRepository userRepository) {
    //        System.out.println("执行 UserController 有参构造方法2!");
    //        this.userService = userService;
    //        this.userRepository = userRepository;
    //    }

    // Setter 方法注入
    //    private UserService userService;
    //    private UserRepository userRepository;
    //
    //    @Autowired
    //    public void setUserService(UserService userService) {
    //        System.out.println("执行 setUserService");
    //        this.userService = userService;
    //    }
    //
    //    @Autowired
    //    public void setUserRepository(UserRepository userRepository) {
    //        System.out.println("执行 setUserRepository");
    //        this.userRepository = userRepository;
    //    }

    public String test() {
        System.out.println(userService.test());
        System.out.println(userRepository.test());
        return "hello userController";
    }

}
