package com.example.livegoods_feelback.service;

import com.liangxin.commons.LiveGoodsResult;

public interface FeelbackService {
    LiveGoodsResult feelback(String orderid, String feelback);
}
