package com.example.usermockito.dao;

import com.example.usermockito.model.User;
import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
