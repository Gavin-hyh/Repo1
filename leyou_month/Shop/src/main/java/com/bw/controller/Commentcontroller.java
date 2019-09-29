package com.bw.controller;

import com.bw.pojo.Comment;
import com.bw.service.Commentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/comment")
@Controller
@RestController
public class Commentcontroller {
    @Autowired
    private Commentservice commentservice;

    @RequestMapping("/list")
    public List<Comment> findall(){
        return commentservice.findall();
    }

    @RequestMapping("/add")
    public String addcomment( Comment comment){
        return commentservice.addcomment(comment);
    }

    @RequestMapping("/queryall")
    public List<Comment> queryall(){
        return commentservice.queryall();
    }
}
