package com.example.springbootmyfirstapplication.service.impl;

import com.example.springbootmyfirstapplication.dao.userDao;
import com.example.springbootmyfirstapplication.entity.user;
import com.example.springbootmyfirstapplication.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class userServiceImpl implements userService {

    @Autowired
    private userDao userDao;
    @Override
    public user finduserByname(String name) {
        return userDao.selectByName(name);
    }

    @Override
    public List<user> selectAll() {
        return userDao.findAll();
    }
}
