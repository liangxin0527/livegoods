package com.example.livegoods_backend_byhot.service;

import com.liangxin.pojo.Product;

import java.util.List;

public interface HotService {

    public List<Product> findHotProduct(String city, int size);
}
