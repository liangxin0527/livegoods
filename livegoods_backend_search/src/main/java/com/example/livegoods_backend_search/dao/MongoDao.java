package com.example.livegoods_backend_search.dao;

import com.liangxin.pojo.House;

import java.util.List;

public interface MongoDao {

    List<House> selectHouseAll();
}
