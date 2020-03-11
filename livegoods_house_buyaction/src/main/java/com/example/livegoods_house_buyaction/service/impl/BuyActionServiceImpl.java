package com.example.livegoods_house_buyaction.service.impl;

import com.example.livegoods_house_buyaction.service.BuyActionService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.House;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class BuyActionServiceImpl implements BuyActionService {
    @Autowired
    private RedisTemplate<String , LiveGoodsResult> resultRedisTemplate;
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public LiveGoodsResult buyaction(House house) {
        LiveGoodsResult lr = new LiveGoodsResult();
        //查询房屋是否已被订购
        String key = "livegoods::house:"+house.getId();
        LiveGoodsResult result = this.resultRedisTemplate.opsForValue().get(key);
        System.out.println(result.get("data"));
        if(result != null && result.get("data") != null){
            House houseRedis = (House) result.get("data");
            if(houseRedis.getStatus() == 0){
                Boolean  status = (Boolean) this.amqpTemplate.convertSendAndReceive("house.direct","action",house);
                if((boolean)status){

                    lr.setStatus(200);
                    lr.put("msg","订购成功");
                    return lr;
                }
            }
        }
        lr.setStatus(500);
        lr.put("msg","手太慢，已经被抢订，预订失败");
        return lr;
    }
}
