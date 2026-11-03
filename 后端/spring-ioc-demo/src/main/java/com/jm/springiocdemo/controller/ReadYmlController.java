package com.jm.springiocdemo.controller;

import com.jm.springiocdemo.entity.DataSourceProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yml")
public class ReadYmlController {

    @Value("${server.port}")
    private Integer serverPort;
    @Value("${string.str1}")
    private String str1;
    @Value("${string.str2}")
    private String str2;
    @Value("${string.str3}")
    private String str3;

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @PostConstruct
    public void read() {
        System.out.println("serverPort : " + serverPort);
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("dataSourceProperties : " + dataSourceProperties);
    }

}
