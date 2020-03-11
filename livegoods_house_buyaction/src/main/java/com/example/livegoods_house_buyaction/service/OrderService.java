package com.example.livegoods_house_buyaction.service;

import com.liangxin.commons.LiveGoodsResult;

public interface OrderService {
    LiveGoodsResult findOrders(String user);
}
