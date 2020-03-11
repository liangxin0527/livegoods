package com.example.livegoods_frontend_byrecommen.service;

import com.liangxin.commons.LiveGoodsResult;

public interface RecommendationService {
    public LiveGoodsResult  findProductByRecommendation(String city,int size);
}
