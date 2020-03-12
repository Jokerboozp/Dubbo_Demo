package com.sc.serviceimpl;

import com.sc.entity.User;
import com.sc.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User selectById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("joker");
        user.setTelphone("15239593182");
        return user;
    }
}
