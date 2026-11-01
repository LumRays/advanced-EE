package com.jm.springiocdemo;

import com.jm.springiocdemo.component.UserComponent;
import com.jm.springiocdemo.configuration.UserConfiguration;
import com.jm.springiocdemo.controller.UserController;
import com.jm.springiocdemo.repository.UserRepository;
import com.jm.springiocdemo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIocDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringIocDemoApplication.class, args);
        UserController bean = context.getBean(UserController.class);
        System.out.println(bean.test());
        System.out.println(bean);

        UserController userController = (UserController) context.getBean("userController");
        System.out.println(userController.test());
        System.out.println(userController);

        UserController bean1 = context.getBean("userController", UserController.class);
        System.out.println(bean1.test());
        System.out.println(bean1);

        System.out.println("==================================");

        UserService bean2 = context.getBean(UserService.class);
        System.out.println(bean2.test());
        System.out.println(bean2);

        System.out.println("==================================");

        UserRepository bean3 = context.getBean(UserRepository.class);
        System.out.println(bean3.test());
        System.out.println(bean3);

        System.out.println("==================================");

        UserConfiguration bean4 = context.getBean(UserConfiguration.class);
        System.out.println(bean4.test());
        System.out.println(bean4);

        System.out.println("==================================");

        UserComponent bean5 = context.getBean(UserComponent.class);
        System.out.println(bean5.test());
        System.out.println(bean5);

    }

}
