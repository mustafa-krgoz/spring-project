package com.example.mustafa.main;

import com.example.mustafa.model.User;
import com.example.mustafa.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        UserService userService1 = new UserService();

        List<User> userList = new ArrayList<>();
        userList.add(new User("Ahmet"));
        userList.add(new User("Mustafa"));

        userService1.setUserList(userList);

    }
}
