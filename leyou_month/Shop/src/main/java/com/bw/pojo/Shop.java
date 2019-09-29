package com.bw.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_shop")
public class Shop {
    @Id
    private Integer sid;
    private String name;
    private Integer price;
    private Date production_date;
    private Integer status;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Shop() {
    }

    public Shop(Integer sid, String name, Integer price, Date production_date, Integer status) {
        this.sid = sid;
        this.name = name;
        this.price = price;
        this.production_date = production_date;
        this.status = status;
    }
}
