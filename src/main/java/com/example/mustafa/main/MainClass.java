package com.example.mustafa.main;

import com.example.mustafa.config.AppConfig;
import com.example.mustafa.model.User;
import com.example.mustafa.services.LoginService;
import com.example.mustafa.services.UserService;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()) {
            System.out.println(user);
        }

        LoginService loginService = new LoginService();
        loginService.login();
    }
}
