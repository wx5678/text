package com.example.demo1.Login.service;

import com.example.demo1.Login.entity.Users;

public interface IUserService {

    //登陸
    public Users login(String username, String userpassword);

}