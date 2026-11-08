package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select * from user_info")
    List<UserInfo> selectAll();

    @Select("select * from user_info where id = #{id}")
    UserInfo selectById(Integer id);

    @Select("select * from user_info WHERE age = #{age} AND gender = #{gender};")
    UserInfo selectByAgeAndGender(Integer age, Integer gender);

}
