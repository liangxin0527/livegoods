package com.example.livegoods_house_buyaction.dao;

import com.liangxin.pojo.Order;

import java.util.List;

public interface OrderDao {
    List<Order> selectOrders(String user);
}
