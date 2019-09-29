package com.bw.service;

import com.bw.mapper.Usermapper;
import com.bw.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {
    @Autowired
    private Usermapper usermapper;

    public String login(User user) {
        List list  = usermapper.selectByExample(user);
        if(list != null){
            return "ok";
        }else{
            return "no";
        }
    }
}
