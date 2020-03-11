package com.example.livegoods_frontend_search.service;

import com.liangxin.commons.LiveGoodsResult;

public interface DetailService {
    LiveGoodsResult findHouseByid(String id);
    public  LiveGoodsResult findByHouseTimeByid(String id);
}
