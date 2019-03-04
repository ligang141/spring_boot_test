package com.example.springbootmyfirstapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService_mybatisTest {
    @Autowired
    private userService_mybatisTest userService_mybatisTest;

    public int add(int id,String name,String password){
        return userService_mybatisTest.add(id,name,password);
    }
}
