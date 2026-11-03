package com.jm.springiocdemo;

import ch.qos.logback.core.hook.DefaultShutdownHook;
import com.jm.springiocdemo.component.UserComponent;
import com.jm.springiocdemo.configuration.UserConfiguration;
import com.jm.springiocdemo.controller.UserController;
import com.jm.springiocdemo.entity.UserInfo;
import com.jm.springiocdemo.repository.UserRepository;
import com.jm.springiocdemo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tools.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringIocDemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringIocDemoApplication.class, args);
    //        UserController bean = context.getBean(UserController.class);
    //        System.out.println(bean.test());
    //        System.out.println(bean);
    //
    //        UserController userController = (UserController) context.getBean("userController");
    //        System.out.println(userController.test());
    //        System.out.println(userController);
    //
    //        UserController bean1 = context.getBean("userController", UserController.class);
    //        System.out.println(bean1.test());
    //        System.out.println(bean1);
    //
    //        System.out.println("==================================");
    //
    //        UserService bean2 = context.getBean(UserService.class);
    //        System.out.println(bean2.test());
    //        System.out.println(bean2);
    //
    //        System.out.println("==================================");
    //
    //        UserRepository bean3 = context.getBean(UserRepository.class);
    //        System.out.println(bean3.test());
    //        System.out.println(bean3);
    //
    //        System.out.println("==================================");
    //
    //        UserConfiguration bean4 = context.getBean(UserConfiguration.class);
    //        System.out.println(bean4.test());
    //        System.out.println(bean4);
    //
    //        System.out.println("==================================");
    //
    //        UserComponent bean5 = context.getBean(UserComponent.class);
    //        System.out.println(bean5.test());
    //        System.out.println(bean5);
    //
    //        System.out.println("==================================");
    //
    //        DefaultShutdownHook bean6 = context.getBean(DefaultShutdownHook.class);
    //        System.out.println(bean6);
    //
    //        System.out.println("==================================");
    //
    //        UserInfo bean7 = context.getBean("userInfo2", UserInfo.class);
    //        System.out.println(bean7);
    //
    //        System.out.println("===============DI===============");
    //
    //        UserController bean8 = context.getBean(UserController.class);
    //        bean8.test();
    //
    //        UserService bean9 = context.getBean(UserService.class);
    //        bean9.test();

    }

}
