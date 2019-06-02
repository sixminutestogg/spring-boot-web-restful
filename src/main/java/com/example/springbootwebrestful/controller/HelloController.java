package com.example.springbootwebrestful.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class HelloController
{
/*
    @RequestMapping({"/","/index.html"})
    public String index(){
        return "login";

    }
*/
    @ResponseBody
    @RequestMapping("/hello")
    public String toString() {
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        //classpath:/templates/success.html
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("张三","历史","王五"));
        return  "success";
    }
    @RequestMapping("/test")
    public String test(@RequestParam(value = "name",required = false) String name, ModelMap modelMap, HttpServletResponse response){
        //classpath:/templates/success.html
        Map<String ,Object>map=new HashMap<>();
        List<String> list=new ArrayList<>();
        list.add("未通过");
        list.add("通过");
        list.add("转人工处理");
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),i+1);
        }
        JSONObject object=new JSONObject(map);

        modelMap.put("mapchart",object);
        return  "pie";
    }

}
