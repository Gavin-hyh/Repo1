package com.bw.pojo;

import tk.mybatis.mapper.common.Mapper;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user")
public class User {
    @Id
    private Integer uid;
    private String uname;
    private String pwd;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static interface Usermapper extends Mapper {
    }
}
