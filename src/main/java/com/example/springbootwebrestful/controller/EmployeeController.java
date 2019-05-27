package com.example.springbootwebrestful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    //查询所有员工的返回页面
    @GetMapping("/emps")
    public String query(){
        return "emp/list";
    }
}
