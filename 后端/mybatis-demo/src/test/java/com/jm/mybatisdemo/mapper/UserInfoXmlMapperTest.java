package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class UserInfoXmlMapperTest {

    //@Autowired
    private UserInfoXmlMapper userInfoXmlMapper;

    @Autowired
    public UserInfoXmlMapperTest(UserInfoXmlMapper userInfoXmlMapper) {
        this.userInfoXmlMapper = userInfoXmlMapper;
    }

    @Test
    void selectAll() {

        userInfoXmlMapper.selectAll().forEach(System.out::println);

    }

    @Test
    void selectById() {

        System.out.println(userInfoXmlMapper.selectById(6));

    }

    @Test
    void selectByAgeAndGender() {

        System.out.println(userInfoXmlMapper.selectByAgeAndGender(12, 1));

    }

    @Test
    void selectByAgeAndGender2() {

        System.out.println(userInfoXmlMapper.selectByAgeAndGender2(12, 1));

    }

    @Test
    void insertUser() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("敖隐");
        userInfo.setPassword("dragon");
        userInfo.setAge(5);
        userInfo.setGender(1);
        Integer result = userInfoXmlMapper.insertUser(userInfo);
        log.info("影响行数: {}, 自增 ID: {}", result, userInfo.getId());

    }

    @Test
    void insertUser2() {

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("孙权");
        userInfo.setPassword("sunquan");
        userInfo.setAge(16);
        userInfo.setGender(1);
        Integer result = userInfoXmlMapper.insertUser2(userInfo);
        log.info("影响行数: " + result);

    }

    @Test
    void deleteUserById() {

        Integer result = userInfoXmlMapper.deleteUserById(12);
        log.info("影响行数: {}", result);

    }

    @Test
    void updateUserByPassword() {

        UserInfo userInfo = new UserInfo();
        userInfo.setAge(6);
        userInfo.setId(11);
        Integer result = userInfoXmlMapper.updateUserByPassword(userInfo);
        log.info("影响行数: {}", result);

    }

}