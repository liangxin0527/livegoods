package com.example.livegood_usersservice.dao.impl;

import com.example.livegood_usersservice.dao.UserDao;
import com.liangxin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insertUsers(Users users) {
        this.mongoTemplate.insert(users);
    }

    @Override
    public void deleteUsers(Users users) {
        this.mongoTemplate.remove(users);
    }
}
