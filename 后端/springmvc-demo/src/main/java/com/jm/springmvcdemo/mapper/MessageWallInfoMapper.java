package com.jm.springmvcdemo.mapper;

import com.jm.springmvcdemo.entity.MessageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageWallInfoMapper {

    @Insert("insert into message_wall_info (`from`, `to`, `message`) values (#{from}, #{to}, #{message})")
    Integer insertMessage(MessageInfo messageInfo);

    @Select("select * from message_wall_info where delete_flag = 0")
    List<MessageInfo> searchMessages();

}
