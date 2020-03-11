package com.example.livegoods_rabbitmq_service.dao;

import com.liangxin.commons.LiveGoodsResult;

public interface RedisDao {
    LiveGoodsResult get(String key);
    void set(String key, LiveGoodsResult house);
}
