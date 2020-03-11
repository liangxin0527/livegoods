package com.example.livegoods_rabbitmq_service.dao.impl;

import com.example.livegoods_rabbitmq_service.dao.RedisDao;
import com.liangxin.commons.LiveGoodsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisDaoImpl implements RedisDao {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public LiveGoodsResult get(String key) {
        return (LiveGoodsResult) this.redisTemplate.opsForValue().get(key);
    }

    @Override
    public void set(String key, LiveGoodsResult house) {
        this.redisTemplate.opsForValue().set(key,house);
    }
}

