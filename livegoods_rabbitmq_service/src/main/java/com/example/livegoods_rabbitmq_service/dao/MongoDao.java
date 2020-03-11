package com.example.livegoods_rabbitmq_service.dao;

import com.liangxin.pojo.House;
import com.liangxin.pojo.Order;
import com.liangxin.pojo.Orders;

public interface MongoDao {
    int update(House house);
    Order insertOrder(Order order);
}
