package com.hks.springrabbitmq.user;

import java.io.Serializable;

/**
 * @Author: hekuangsheng
 * @Date: 2018/10/12
 */
public class User implements Serializable {
    private String name;
    private String pass;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
}
