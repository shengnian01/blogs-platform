package com.example.blogs.controller;

import com.example.blogs.pojo.User;
import com.example.blogs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public String getUser(){
        User user=userService.getUser(1l);
        return "my name is jack!"+user.toString();
    }
}
