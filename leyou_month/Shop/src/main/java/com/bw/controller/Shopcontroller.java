package com.bw.controller;

import com.bw.pojo.Shop;
import com.bw.service.Shopservice;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/shop")
public class Shopcontroller {
    @Autowired
    private Shopservice shopservice;
    @RequestMapping("/list")
    public PageInfo<Shop> findall(
            @RequestParam(name = "pageNum",defaultValue="1") Integer pageNum,
            @RequestParam(name = "pageSize",defaultValue = "5") Integer pageSize,
            @RequestParam(name = "minprice",required=false) Integer minprice,
            @RequestParam(name = "maxprice",required=false) Integer maxprice,
            String name){
         return shopservice.findall(pageNum, pageSize, minprice, maxprice, name);
    }

    @RequestMapping("/down")
    public String down(int [] sid){
        shopservice.down(sid);
        return "ok";
    }
}
