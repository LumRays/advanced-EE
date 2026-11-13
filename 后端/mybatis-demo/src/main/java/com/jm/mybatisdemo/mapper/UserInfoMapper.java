package com.jm.mybatisdemo.mapper;

import com.jm.mybatisdemo.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select * from user_info")
    //@Select("select id, username, password, age, gender," +
    //        " delete_flag as deleteFlag, create_time as createTime, update_time as updateTime from user_info;")
    //@Results({
    //        @Result(column = "delete_flag", property = "deleteFlag"),
    //        @Result(column = "create_time", property = "createTime"),
    //        @Result(column = "update_time", property = "updateTime")
    //})
    List<UserInfo> selectAll();

    @Select("select * from user_info where id = #{id}")
    UserInfo selectById(Integer id);

    @Select("select * from user_info WHERE age = #{age} AND gender = #{gender};")
    UserInfo selectByAgeAndGender(Integer age, Integer gender);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into user_info (username, password, age, gender) values (#{username}, #{password}, #{age}, #{gender})")
    Integer insertUser(UserInfo userInfo);

    @Insert("insert into user_info (username, password, age, gender) values (#{userInfo.username}, #{userInfo.password}, #{userInfo.age}, #{userInfo.gender})")
    Integer insertUser2(@Param("userInfo") UserInfo userInfo);

    @Delete("delete from user_info where id = #{id}")
    Integer deleteUserById(Integer id);

    @Update("update user_info set password = #{password} where id = #{id}")
    Integer updateUserByPassword(UserInfo userInfo);

}
