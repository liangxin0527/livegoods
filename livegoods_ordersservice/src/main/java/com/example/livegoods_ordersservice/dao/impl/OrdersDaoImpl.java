package com.example.livegoods_ordersservice.dao.impl;

import com.example.livegoods_ordersservice.dao.OrdersDao;
import com.liangxin.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDaoImpl implements OrdersDao {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void insertOrders(Orders orders) {
        this.mongoTemplate.insert(orders);
    }
    @Override
    public void deleteOrders(Orders orders) {
        this.mongoTemplate.remove(orders);
    }
}
