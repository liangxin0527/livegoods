package com.example.livegoods_ordersservice.dao;

import com.liangxin.pojo.Orders;

public interface OrdersDao {
    void insertOrders(Orders orders);
    void deleteOrders(Orders orders);
}
