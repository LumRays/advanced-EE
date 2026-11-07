package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.UserInfo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    void selectAll() {

        List<UserInfo> userInfos = userInfoMapper.selectAll();
        userInfos.forEach(System.out::println);

    }

    @BeforeEach
    void setUp() {
        System.out.println("每一个测试用例执行之前都要执行 setUp() !");
    }

    @AfterEach
    void tearDown() {
        System.out.println("每一个测试用例执行之后都要执行 tearDown() !");
    }
}