package com.example.springbootwebrestful.config;

import com.example.springbootwebrestful.component.LoginHandlerInterceptor;
import com.example.springbootwebrestful.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//使用WebMvcConfigurer可以扩展springmvc的功能
//@EnableWebMvc
@Configuration
public class Myconfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //游览器发送 /zhangyy 请求 重定向到 suceess
        registry.addRedirectViewController("/zhangyy","success");
        //游览器发送 /zhang 请求 到 suceess
        registry.addViewController("/zhang").setViewName("/success");
    }
    //所有的webconfigureradapter组件都会一起起作用
    @Bean//将组件注册到容器中
    public  WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer configuration=new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //静态资源映射 不需要配置 springbooot 有相关配置实现正常访问
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login");
            }
        };
        return  configuration;
    }
    @Bean
    public LocaleResolver localeResolver(){
        return  new MyLocaleResolver();
    }

}
