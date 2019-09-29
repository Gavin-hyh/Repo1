package com.bw.service;

import com.bw.mapper.Commentmapper;
import com.bw.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Commentservice {
    @Autowired
    private Commentmapper commentmapper;

    public List<Comment> findall() {
        return commentmapper.selectAll();
    }

    public List<Comment> queryall(){
        return commentmapper.queryall();
    }

    public String addcomment(Comment comment) {
        if(comment != null){
            commentmapper.insertcomment(comment);
            return "ok";
        }else{
            return "no";
        }
    }
}
