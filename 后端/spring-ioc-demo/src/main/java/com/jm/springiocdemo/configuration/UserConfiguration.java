package com.jm.springiocdemo.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    public String test() {
        return "hello userConfiguration";
    }

}
