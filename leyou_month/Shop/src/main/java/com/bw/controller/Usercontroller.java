package com.bw.controller;

import com.bw.pojo.User;
import com.bw.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Controller
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @RequestMapping("/login/{user}")
    public String login(@PathVariable(name = "user") User user){
        return userservice.login(user);
    }
}
