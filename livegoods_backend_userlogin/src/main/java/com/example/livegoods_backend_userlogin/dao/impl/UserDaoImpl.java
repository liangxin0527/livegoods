package com.example.livegoods_backend_userlogin.dao.impl;

import com.example.livegoods_backend_userlogin.dao.UserDao;
import com.liangxin.pojo.Users;
import com.mongodb.client.result.DeleteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Users selectByUsername(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        return this.mongoTemplate.findOne(query,Users.class);
    }

    @Override
    public Users insert(Users user) {
        return this.mongoTemplate.insert(user);
    }

    @Override
    public int deleteByUsername(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        DeleteResult remove = this.mongoTemplate.remove(query, Users.class);
        return (int)remove.getDeletedCount();
    }
}
