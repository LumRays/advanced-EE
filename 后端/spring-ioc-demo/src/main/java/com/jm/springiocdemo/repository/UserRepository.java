package com.jm.springiocdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String test() {
        return "hello userRepository";
    }

}
