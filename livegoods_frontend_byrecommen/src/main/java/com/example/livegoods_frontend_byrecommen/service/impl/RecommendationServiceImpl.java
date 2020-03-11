package com.example.livegoods_frontend_byrecommen.service.impl;

import com.example.livegoods_frontend_byrecommen.feign.RecommendationServiceFeignClient;
import com.example.livegoods_frontend_byrecommen.service.RecommendationService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    @Autowired
    private RecommendationServiceFeignClient  recommendationServiceFeignClient;
    @Value("${fastdfs_host}")
    private  String ngnix_host;

    @Override
    public LiveGoodsResult findProductByRecommendation(String city, int size) {
        List<Product> list = recommendationServiceFeignClient.findRecommendation(city, size);
        for (Product product : list) {

            product.setImg(ngnix_host+product.getImg());
        }
        LiveGoodsResult liveGoodsResult = new LiveGoodsResult();
        liveGoodsResult.setStatus(200);
        liveGoodsResult.put("data",list);
        return liveGoodsResult;
    }
}
