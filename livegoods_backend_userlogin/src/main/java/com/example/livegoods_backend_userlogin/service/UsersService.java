package com.example.livegoods_backend_userlogin.service;

import com.liangxin.pojo.Users;

public interface UsersService {
    Users selectByUsername(String username);
    int insert(Users user);
}
