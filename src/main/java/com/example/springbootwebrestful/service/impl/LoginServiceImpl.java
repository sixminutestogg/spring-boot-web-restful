package com.example.springbootwebrestful.service.impl;

import com.example.springbootwebrestful.dao.UserDao;
import com.example.springbootwebrestful.entities.User;
import com.example.springbootwebrestful.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;
    @Override
    public User login(Map map) {
        return userDao.login(map);
    }
}
