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

//    @RequestMapping("/chart")
//    public String chart(Map<String,Object> map){
////        Map<String, Object>map8=new HashMap<String, Object>();
////        List<Product>list8=pbiz.stocklist();
////        for(int i=0;i<list8.size();i++){
////            map8.put(list8.get(i).getCategorylevel1(), list8.get(i).getStock());
////        }
////        JSONObject object=new JSONObject(map8);
////
////            response.setContentType("application/json;charset=utf-8");
////            out.print(object);
////				/*System.out.println("key"+object);*/
////        return  null;
//    }

//    @RequestMapping("/zhuzi")
//        public String zhuzi(){
//        List<Integer> allstock=new ArrayList<Integer>();
//        List<Integer>allstock1=new ArrayList<Integer>();
//        List<Product>list7=pbiz.list(null);
//        for(int i=0;i<list7.size();i++){
//            allstock.add(list7.get(i).getStock());
//            allstock1.add(list7.get(i).getPrice());
//        }
//        MapList m=new MapList("???",allstock);
//        MapList n=new MapList("???",allstock1);
//        List<MapList>list71=new ArrayList<MapList>();
//        list71.add(m);
//        list71.add(n);
//        JSONArray array=new JSONArray();
//        array.addAll(list71);
//        String str7=array.toString();
//			/*System.out.println(str7);*/
//        out.print(str7);
//        return  null;
//        }
}
