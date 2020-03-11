package com.example.livegoods_backend_userlogin.dao;

import com.liangxin.pojo.Users;

public interface UserDao {
    /*
    根据用户名进行查询
    作用：
        用户登录后判断用户是否已经注册
     */
    Users selectByUsername(String username);
    /*
    新增用户
    作用：
        登录成功后，如果用户没有被注册，进行注册
     */
    Users insert(Users user);
    /*
    删除用户
    作用：
        如果需要回滚事务，删除之前新增的用户
     */
    int deleteByUsername(String username);
}
