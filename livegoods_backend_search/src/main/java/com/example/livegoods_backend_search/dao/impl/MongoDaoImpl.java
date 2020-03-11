package com.example.livegoods_backend_search.dao.impl;

import com.example.livegoods_backend_search.dao.MongoDao;
import com.liangxin.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MongoDaoImpl implements MongoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<House> selectHouseAll() {
        return this.mongoTemplate.findAll(House.class);
    }
}
