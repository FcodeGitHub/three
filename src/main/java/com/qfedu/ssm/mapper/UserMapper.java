package com.qfedu.ssm.mapper;

import com.qfedu.ssm.pojo.User;

public interface UserMapper {

    int validateEmail(User user);

    int regUser(User user);

    int validateLogin(User user);
}
