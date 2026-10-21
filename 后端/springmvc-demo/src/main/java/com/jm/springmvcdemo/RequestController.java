package com.jm.springmvcdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class RequestController {

    @RequestMapping("/r1")
    public String r1(String str) {
        return "接收到参数: " + str;
    }

    @RequestMapping("/r2")
    public String r2(String name, Integer age) {
        return String.format("接收到参数: 姓名: [%s], 年龄: [%d]", name, age);
    }

    @RequestMapping("/r3")
    public String r3(Person person) {
        return String.format("接收到参数: " + person);
    }

    @RequestMapping("/r4")
    public String r4(@RequestParam(value = "sa", required = false) String name) {
        return "接收到参数: " + name;
    }

}
