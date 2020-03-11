package com.example.livegoods_rabbitmq_service.dao.impl;

import com.example.livegoods_rabbitmq_service.dao.MongoDao;
import com.liangxin.pojo.House;
import com.liangxin.pojo.Order;
import com.liangxin.pojo.Orders;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class MongoDaoImpl implements MongoDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public int update(House house) {
        Query query = new Query(Criteria.where("id").is(house.getId()));
        Update update = new Update();
        update.set("status", 1);
        update.set("user", house.getUser());
        UpdateResult updateResult = this.mongoTemplate.updateFirst(query, update, House.class);
        return (int) updateResult.getModifiedCount();
    }

    @Override
    public Order insertOrder(Order order) {
        return this.mongoTemplate.insert(order);
    }


}
