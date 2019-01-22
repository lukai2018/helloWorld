package com.demo.controller;

import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private User user;

    @RequestMapping("/hello")
    public User hello(){
        return new User();
    }

    @RequestMapping("/hello1")
    public User hello1(){
        return this.user;
    }
}
