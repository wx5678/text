package com.example.demo1.Login.service;

import com.example.demo1.Login.Dao.IUserDao;
import com.example.demo1.Login.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("iUserService")
    public class IUserServiceImpl implements IUserService {

        //植入dao层对象
        @Resource
        private IUserDao dao;

        @Override
        public Users login(String username, String userpassword) {
            return dao.login(username,userpassword);
        }
    }

