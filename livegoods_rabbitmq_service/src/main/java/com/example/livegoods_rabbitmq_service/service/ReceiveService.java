package com.example.livegoods_rabbitmq_service.service;

import com.example.livegoods_rabbitmq_service.dao.MongoDao;
import com.example.livegoods_rabbitmq_service.dao.RedisDao;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.House;
import com.liangxin.pojo.Order;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

@Service
public class ReceiveService {
    @Autowired
    private MongoDao mongoDao;
    @Autowired
    private RedisDao redisDao;

    @RabbitListener(bindings =
    @QueueBinding(
            value = @Queue(name = "buyaction"),
            exchange = @Exchange(value = "house.direct",type = ExchangeTypes.DIRECT),
            key = "action"))
    public boolean receive(Message msg) {
        try {
            byte[] body = msg.getBody();
            ByteArrayInputStream bis = new ByteArrayInputStream(body);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object result = ois.readObject();
            House house = (House) result;
            String redisKey = "livegoods::house:" + house.getId();
            LiveGoodsResult liveGoodsResult = this.redisDao.get(redisKey);
            House houseRedis = (House) liveGoodsResult.getData();
            //0:未出租。1：已出租
            if (houseRedis.getStatus() == 0) {
                houseRedis.setStatus(1);
                houseRedis.setUser(house.getUser());
                //修改缓存数据
                this.redisDao.set(redisKey, liveGoodsResult);
                this.mongoDao.update(houseRedis);
                Order order = new Order();
                order.setCommentState(0);
                order.setHouseType(houseRedis.getHouseType());
                order.setImg(houseRedis.getImgs()[0]);
                order.setPrice(houseRedis.getPrice());
                order.setRentType(houseRedis.getRentType());
                order.setTitle(houseRedis.getTitle());
                order.setUser(house.getUser());
                mongoDao.insertOrder(order);



                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
