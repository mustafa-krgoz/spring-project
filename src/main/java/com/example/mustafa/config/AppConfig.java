package com.example.mustafa.config;

import com.example.mustafa.model.User;
import com.example.mustafa.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        UserService userService = new UserService();

        List<User> userList = new ArrayList<>();
        userList.add(new User("Ahmet"));
        userList.add(new User("Mustafa"));

        userService.setUserList(userList);

        return userService;

        // 	1.	new UserService() → RAM’de yeni bir UserService nesnesi yaratılır.
        //	2.	userService değişkeni → Bu nesnenin adresini tutar.
    }
}
