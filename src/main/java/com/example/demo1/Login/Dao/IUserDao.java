package com.example.demo1.Login.Dao;


import com.example.demo1.Login.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("iUserDao")
public interface IUserDao{

    //登录
    Users login(@Param("username") String username, @Param("userPassword") String userPassword);

}
