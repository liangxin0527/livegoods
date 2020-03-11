package com.example.livegoods_backend_search.service.impl;

import com.example.livegoods_backend_search.dao.DetailDao;
import com.example.livegoods_backend_search.service.DetailService;
import com.liangxin.pojo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private DetailDao detailDao;
    @Override
    public House findHouseById(String id) {
        return detailDao.selectById(id);
    }
}
