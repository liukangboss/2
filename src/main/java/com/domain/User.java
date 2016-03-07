package com.domain;

import org.springframework.stereotype.Component;

/**
 * Created by LiuKang on 2016/2/29.
 */
@Component
public class User {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + user_name + '\'' +
                '}';
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    private String user_name;
}
