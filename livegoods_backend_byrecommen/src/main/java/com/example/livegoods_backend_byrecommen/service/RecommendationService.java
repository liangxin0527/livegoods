package com.example.livegoods_backend_byrecommen.service;

import com.liangxin.pojo.Product;

import java.util.List;

public interface RecommendationService {
    List<Product> findProductRecommendation(String city, int size);

}
