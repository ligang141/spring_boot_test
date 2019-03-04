package com.example.springbootmyfirstapplication.service;

import com.example.springbootmyfirstapplication.entity.user;

import java.util.List;

public interface userService {
    public user finduserByname(String name);
    public List<user> selectAll();
}
