package com.example.livegoods_frontend_search.service.impl;

import com.example.livegoods_frontend_search.feign.SearchServiceFeignClient;
import com.example.livegoods_frontend_search.service.DetailService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Service
@CacheConfig(cacheNames = "livegoods")
public class DetailServiceImpl implements DetailService {
    @Autowired
    private SearchServiceFeignClient searchServiceFeignClient;
    @Value("${fastdfs_host}")
    private String fastdfs_host;

    @Override
    @Cacheable(key="'house:'+#id")
    public LiveGoodsResult findHouseByid(String id) {
        House houseById = searchServiceFeignClient.findHouseById(id);
        //System.out.println(houseById+"================");
        LiveGoodsResult liveGoodsResult = new LiveGoodsResult();
        String[] imgs = houseById.getImgs();
        for (int i = 0; i < imgs.length; i++) {
            imgs[i]=fastdfs_host+imgs[i];
        }
        liveGoodsResult.put("data",houseById);
        liveGoodsResult.setStatus(200);
        return liveGoodsResult;
    }

    @Override
    public LiveGoodsResult findByHouseTimeByid(String id) {

        House house = this.searchServiceFeignClient.findHouseById(id);
        LiveGoodsResult liveGoodsResult = new LiveGoodsResult();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String format = sdf.format(house.getTime());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            liveGoodsResult.put("time",sdf2.parse(format).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return liveGoodsResult;
    }
}
