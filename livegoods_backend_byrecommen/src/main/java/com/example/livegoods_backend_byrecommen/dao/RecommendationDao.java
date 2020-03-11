package com.example.livegoods_backend_byrecommen.dao;

import com.liangxin.pojo.Product;

import java.util.List;

public interface RecommendationDao {
    List<Product> findRecommendation(String city,int size);
}
