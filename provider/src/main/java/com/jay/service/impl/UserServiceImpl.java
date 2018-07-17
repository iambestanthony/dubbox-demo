package com.jay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jay.domain.User;
import com.jay.service.IUserService;

/**
 * Created by JayJ on 2018/7/15.
 **/
@Service
public class UserServiceImpl implements IUserService {
    public User getId() {
        User user = new User();
        user.setId(10880);
        return user;
    }
}
