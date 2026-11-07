package com.jm.springiocdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger")
public class LoggerController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/print")
    public String print() {

        System.out.println("打印日志!");
        //logger.info("打印日志!");
        logger.error("打印 error 日志!");
        logger.warn("打印 warn 日志!");
        logger.info("打印 info 日志!");
        logger.debug("打印 debug 日志!");
        logger.trace("打印 trace 日志!");
        return "日志打印成功!";

    }

}
