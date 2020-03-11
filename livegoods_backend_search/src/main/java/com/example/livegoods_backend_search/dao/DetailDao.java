package com.example.livegoods_backend_search.dao;

import com.liangxin.pojo.House;

public interface DetailDao {
    House selectById(String id);
}
