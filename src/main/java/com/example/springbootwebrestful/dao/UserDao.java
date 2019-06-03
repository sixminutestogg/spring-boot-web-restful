package com.example.springbootwebrestful.dao;

import com.example.springbootwebrestful.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
@Mapper
public interface UserDao {
    public User login(Map map);
}
