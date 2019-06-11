package com.example.springbootwebrestful.service;

import com.example.springbootwebrestful.dao.UserDao;
import com.example.springbootwebrestful.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginService {

    @Autowired
    UserDao userDao;
    public User login(Map map){
        return  userDao.login(map);
    }
}
