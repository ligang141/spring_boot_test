package com.example.springbootmyfirstapplication.Controller;

import com.example.springbootmyfirstapplication.entity.user;
import com.example.springbootmyfirstapplication.service.userService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Resource
    private userService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<user> getUser(){
        return  userService.selectAll();
    }

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public user selectByname(@PathVariable("name")String name){
        return userService.finduserByname(name);
    }

}
