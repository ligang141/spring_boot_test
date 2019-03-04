package com.example.springbootmyfirstapplication.Controller;

import com.example.springbootmyfirstapplication.service.userService_mybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class userController_mybatisTest {
    @Autowired
    userService_mybatisTest userService_mybatisTest;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "id") int id,@RequestParam(value = "name") String name,
                              @RequestParam(value = "password") String  password) {

        int t= userService_mybatisTest.add(id,name,password);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

}
