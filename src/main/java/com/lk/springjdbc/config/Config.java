package com.lk.springjdbc.config;

import com.lk.springjdbc.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author leike
 * @date 2019/2/18 16:48
 */
@Configuration
public class Config implements WebMvcConfigurer {

    /**
     * 自定义登录拦截器
     */
    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/user/login", "/", "/login", "/asserts/**", "/webjars/**");
    }
}
