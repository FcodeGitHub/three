package com.qfedu.ssm.service;

import com.qfedu.ssm.pojo.User;

public interface UserService {

    boolean validateEmail(User user);

    boolean regUser(User user);

    boolean validateLogin(User user);
}
