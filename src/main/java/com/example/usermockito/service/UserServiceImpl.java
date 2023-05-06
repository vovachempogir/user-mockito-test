package com.example.usermockito.service;

import com.example.usermockito.dao.UserDaoImpl;
import com.example.usermockito.model.User;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }


    @Override
    public boolean checkUserExist (User user){
        return userDaoImpl.getUserList().contains(user);
    }
}
