package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoXmlMapper {

    List<UserInfo> selectAll();

    UserInfo selectById(Integer id);

    List<UserInfo> selectByAgeAndGender(Integer age, Integer gender);

    List<UserInfo> selectByAgeAndGender2(Integer age, @Param("gen") Integer gender);

    Integer insertUser(UserInfo userInfo);

    Integer insertUser2(@Param("userInfo") UserInfo userInfo);

    Integer deleteUserById(Integer id);

    Integer updateUserByPassword(UserInfo userInfo);

}
