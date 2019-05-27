package com.example.springbootwebrestful.dao;

import com.example.springbootwebrestful.entities.User;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public interface UserDao {
    public User login(Map map);
}
