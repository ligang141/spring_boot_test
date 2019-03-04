package com.example.springbootmyfirstapplication.dao;


import com.example.springbootmyfirstapplication.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//这个user是 对象名，而不是具体的表名，另外Interger是主键的类型，一般为Integer或者Long
public interface userDao extends JpaRepository<user, Integer> {

    @Query(value = "select * from user where name=?",nativeQuery = true)
    user selectByName(String name);

}
