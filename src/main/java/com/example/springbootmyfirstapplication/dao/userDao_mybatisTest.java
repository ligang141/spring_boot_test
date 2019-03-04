package com.example.springbootmyfirstapplication.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface userDao_mybatisTest {

    @Insert("insert into user(id,name,password) values(#{id},#{name},#{password)")
    int add(@Param("id")int id,@Param("name") String name,@Param("password")String password);
}
