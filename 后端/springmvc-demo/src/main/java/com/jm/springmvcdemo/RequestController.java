package com.jm.springmvcdemo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

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

    @RequestMapping("/r5")
    public String r5(String[] array) {
        return "接收到参数: " + Arrays.toString(array);
    }

    @RequestMapping("/r6")
    public String r6(@RequestParam List<String> list) {
        return "接收到参数: " + list;
    }

    @RequestMapping("/r7")
    public String r7(@RequestBody Person person) {
        return "接收到参数: " + person;
    }

    @RequestMapping("/{articleId}")
    public String r8(@PathVariable Integer articleId) {
        return "接收到参数: " + articleId;
    }

    @RequestMapping("/r9")
    public String r9(MultipartFile file) {
        String name = file.getOriginalFilename();
        String contentType = file.getContentType();
        System.out.println("name : " + name);
        System.out.println("contentType : " + contentType);
        return "接收到文件: " + name;
    }

}
