package com.example.livegoods_backend_search.dao.impl;

import com.example.livegoods_backend_search.dao.DetailDao;
import com.liangxin.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DetailDaoImpl  implements DetailDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public House selectById(String id) {

        return this.mongoTemplate.findById(id,House.class);
    }
}
