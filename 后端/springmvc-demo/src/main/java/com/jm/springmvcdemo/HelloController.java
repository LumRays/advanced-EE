package com.jm.springmvcdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //@RequestMapping(value = "/hello1", method = RequestMethod.GET)
    @GetMapping("/hello1")
    public String hello() {
        return "hello, spring mvc";
    }

    @RequestMapping(value = "/hello2", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello2() {
        return "hello, spring mvc2";
    }

}
