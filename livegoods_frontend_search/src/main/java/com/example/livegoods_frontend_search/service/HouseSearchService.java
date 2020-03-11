package com.example.livegoods_frontend_search.service;


import com.liangxin.commons.LiveGoodsResult;

public interface HouseSearchService {
    LiveGoodsResult houseSearch(String city, String keyword, int page, int size);
}
