package com.example.livegoods_backend_byhot.dao;

import com.liangxin.pojo.Product;

import java.util.List;

public interface LivegoodsByhotServcie {

    public List<Product> selectHotByCity(String city,int size);
}
