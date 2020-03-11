package com.example.livegood_usersservice.service.impl;

import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.example.livegood_usersservice.dao.UserDao;
import com.example.livegood_usersservice.service.UsersService;
import com.liangxin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UserDao userDao;

    @Override
    @TccTransaction
    public void addUsers(Users users) {
        userDao.insertUsers(users);
    }
    public void cancelAddUsers(Users users){
        this.userDao.deleteUsers(users);
    }

}
