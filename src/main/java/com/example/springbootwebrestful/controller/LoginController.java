package com.example.springbootwebrestful.controller;

import com.example.springbootwebrestful.entities.User;
import com.example.springbootwebrestful.service.LoginService;
import com.example.springbootwebrestful.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl loginServiceImpl;

    //@PostMapping("/user/login")
    @RequestMapping("/user/login")
    public String login(@RequestParam(value = "username", required = false) String username,
                        @RequestParam(value = "password", required = false) String password,
                        ModelMap map, HttpSession session) {

        Map<String, Object> parm = new HashMap<>();
        parm.put("username", username);
        parm.put("password", password);
        User user = loginServiceImpl.login(parm);

        if (user!=null) {
            map.addAttribute("user", user);
            session.setAttribute("loginUser", user.getFullName());
            //登录成功，防止表单重复提交，可以重定向到主页
            return "redirect:/main.html";
        } else {
            //登录失败！
            map.put("msg", "用户名密码错误");
            return "login";

        }

    }
}
