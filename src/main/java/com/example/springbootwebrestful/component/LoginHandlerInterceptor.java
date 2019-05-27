package com.example.springbootwebrestful.component;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录信息的校验
 */
public class LoginHandlerInterceptor  implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       Object user= request.getSession().getAttribute("loginUser");
        if(user==null){
            //未登录 并回到登录页
            request.setAttribute("msg","没有权请先登录！");
            request.getRequestDispatcher("index.html").forward(request,response);
            return  false;
        }else{
            //已登录 ，放行请求
            return true;
        }

    }

}
