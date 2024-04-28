package com.example.jwt4.service;

import com.example.jwt4.dao.UserDao;
import com.example.jwt4.entity.User;
import com.example.jwt4.dao.UserDao;
import com.example.jwt4.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User registerNewUser(User user){
        return userDao.save(user);
    }
}
