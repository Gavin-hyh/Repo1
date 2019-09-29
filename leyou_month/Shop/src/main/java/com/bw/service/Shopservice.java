package com.bw.service;

import com.bw.mapper.Shopmapper;
import com.bw.pojo.Shop;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shopservice {
    @Autowired
    private Shopmapper shopmapper;


    public PageInfo<Shop> findall(Integer pageNum, Integer pageSize, Integer minprice, Integer maxprice, String name) {
        PageHelper.startPage(pageNum,pageSize);
        String  sql = "select * from tb_shop where 1=1";
        if(name != null){
            sql = sql + " and name like '%"+name+"%'";
        }
        if(minprice != null && maxprice != null){
            sql = sql + " and price >= "+minprice+" and price <= "+maxprice;
        }
        System.out.println(sql);
        List<Shop> list = shopmapper.queryAll(sql);
        PageInfo<Shop> shopPageInfo = new PageInfo<>(list);
        return shopPageInfo;
    }

    public void down(int[] sid) {
        for (int i = 0; i <sid.length ; i++) {
            shopmapper.down(sid[i]);
        }
    }
}
