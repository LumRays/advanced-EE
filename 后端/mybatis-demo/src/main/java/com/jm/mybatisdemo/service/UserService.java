package com.jm.mybatisdemo.service;

import com.jm.mybatisdemo.entity.UserInfo;
import com.jm.mybatisdemo.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getAllUser() {
        return userInfoMapper.selectAll();
    }

}
