package com.qfedu.ssm.service.Impl;

import com.qfedu.ssm.mapper.UserMapper;
import com.qfedu.ssm.pojo.User;
import com.qfedu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public boolean validateEmail(User user) {

        int count = userMapper.validateEmail(user);
        return count > 0 ? false : true;
    }

    @Override
    public boolean regUser(User user) {
        int result = userMapper.regUser(user);
        return result > 0 ? true : false;
    }

    @Override
    public boolean validateLogin(User user) {

        int result = userMapper.validateLogin(user);
        return result > 0 ? true : false;
    }
}
