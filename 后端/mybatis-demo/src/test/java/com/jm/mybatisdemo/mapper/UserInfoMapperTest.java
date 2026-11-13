package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
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

    @Test
    void selectById() {
        UserInfo userInfo = userInfoMapper.selectById(2);
        System.out.println(userInfo);
    }

    @Test
    void selectByAgeAndGender() {
        UserInfo userInfo = userInfoMapper.selectByAgeAndGender(18, 0);
        System.out.println(userInfo);
    }

    @Test
    void insertUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("沈梦溪");
        userInfo.setPassword("cat");
        userInfo.setAge(12);
        userInfo.setGender(1);
        Integer result = userInfoMapper.insertUser(userInfo);
        log.info("影响行数: {}, 自增 ID: {}", result, userInfo.getId());
    }

    @Test
    void insertUser2() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("孙权");
        userInfo.setPassword("sunquan");
        userInfo.setAge(16);
        userInfo.setGender(1);
        Integer result = userInfoMapper.insertUser2(userInfo);
        log.info("影响行数: " + result);
    }

    @Test
    void deleteUserById() {
        Integer result = userInfoMapper.deleteUserById(8);
        log.info("影响行数: {}", result);
    }

    @Test
    void updateUserByPassword() {
        UserInfo userInfo = new UserInfo();
        userInfo.setPassword("egg");
        userInfo.setId(7);
        Integer result = userInfoMapper.updateUserByPassword(userInfo);
        log.info("影响行数: {}", result);
    }
}