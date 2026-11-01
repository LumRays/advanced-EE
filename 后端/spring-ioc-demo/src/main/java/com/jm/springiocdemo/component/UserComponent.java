package com.jm.springiocdemo.component;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {

    public String test() {
        return "hello userComponent";
    }

}
