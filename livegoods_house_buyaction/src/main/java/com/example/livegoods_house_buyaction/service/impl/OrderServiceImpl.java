package com.example.livegoods_house_buyaction.service.impl;

import com.example.livegoods_house_buyaction.dao.OrderDao;
import com.example.livegoods_house_buyaction.service.OrderService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public LiveGoodsResult findOrders(String user) {
        List<Order> orders = orderDao.selectOrders(user);
        LiveGoodsResult liveGoodsResult = new LiveGoodsResult();
        liveGoodsResult.put("data",orders);
        liveGoodsResult.setStatus(200);
        return liveGoodsResult;
    }
}
