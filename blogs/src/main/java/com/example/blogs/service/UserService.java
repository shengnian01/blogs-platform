package com.example.blogs.service;

import com.example.blogs.dao.UserDao;
import com.example.blogs.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User getUser(Long id){
        return userDao.getUserById(id);

    }
}
