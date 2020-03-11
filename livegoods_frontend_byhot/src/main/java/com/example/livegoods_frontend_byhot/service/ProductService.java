package com.example.livegoods_frontend_byhot.service;

import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Product;

import java.util.List;

public interface ProductService {

    LiveGoodsResult findProductByCityAndSize(String city, int size);
}
