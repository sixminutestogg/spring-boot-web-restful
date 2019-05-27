package com.example.springbootwebrestful.service;

import com.example.springbootwebrestful.entities.User;

import java.util.Map;

public interface LoginService {
    public User login(Map map);
}
