package com.example.livegoods_ordersservice.service.impl;

import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.example.livegoods_ordersservice.dao.OrdersDao;
import com.example.livegoods_ordersservice.service.OrdersService;
import com.liangxin.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersDao ordersDao;

    @Override
    @TccTransaction
    public void addOrders(Orders orders) {
        this.ordersDao.insertOrders(orders);
    }

    public void cancelAddOrders(Orders orders){
        this.ordersDao.deleteOrders(orders);
    }
}
