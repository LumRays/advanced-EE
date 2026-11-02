package com.jm.springiocdemo.configuration;

import ch.qos.logback.core.hook.DefaultShutdownHook;
import com.jm.springiocdemo.entity.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public DefaultShutdownHook defaultShutdownHook() {
        return new DefaultShutdownHook();
    }

    @Bean
    public UserInfo userInfo() {
        return new UserInfo("张三", 18);
    }

    @Bean
    public UserInfo userInfo2() {
        return new UserInfo("李四", 26);
    }

}
