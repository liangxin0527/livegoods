package com.example.livegoods_backend_banner.dao.impl;

import com.example.livegoods_backend_banner.dao.BannerDao;
import com.liangxin.pojo.Banner;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BannerDaoImpl implements BannerDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<Banner> selectBannerAll() {
        return this.mongoTemplate.findAll(Banner.class);
    }
}
