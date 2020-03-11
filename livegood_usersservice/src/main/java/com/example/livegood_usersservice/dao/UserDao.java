package com.example.livegood_usersservice.dao;

import com.liangxin.pojo.Users;

public interface UserDao {
    void insertUsers(Users users);
    void deleteUsers(Users users);

}
