package com.service;

import com.domain.User;
import com.imp.UserDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiuKang on 2016/3/3.
 */
@Service
public class MyService {
    @Autowired
    private UserDaoImp userDaoImp;
    public List<User> getUsers(){
        List<User> userList = userDaoImp.selectUser();
        return userList;
    }
}
