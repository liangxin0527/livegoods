package com.example.livegoods_backend_byrecommen.service.impl;

import com.example.livegoods_backend_byrecommen.dao.RecommendationDao;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements com.example.livegoods_backend_byrecommen.service.RecommendationService {
    @Autowired
    private RecommendationDao recommendationDao;

    @Override
    public List<Product> findProductRecommendation(String city, int size) {
        return this.recommendationDao.findRecommendation(city,size);
    }
}
