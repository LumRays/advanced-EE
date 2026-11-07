package com.jm.springiocdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/logger2")
public class LoggerController2 {

    @RequestMapping("/print2")
    public String print() {

        System.out.println("打印日志!");
        //logger.info("打印日志!");
        log.error("打印 error 日志!");
        log.warn("打印 warn 日志!");
        log.info("打印 info 日志!");
        log.debug("打印 debug 日志!");
        log.trace("打印 trace 日志!");
        return "日志打印成功!";

    }

}
