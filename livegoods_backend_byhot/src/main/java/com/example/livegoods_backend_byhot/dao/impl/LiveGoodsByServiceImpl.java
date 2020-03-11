package com.example.livegoods_backend_byhot.dao.impl;

import com.example.livegoods_backend_byhot.dao.LivegoodsByhotServcie;
import com.liangxin.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class LiveGoodsByServiceImpl implements LivegoodsByhotServcie {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Product> selectHotByCity(String city, int size) {
        Query query = new Query(Criteria.where("city").is(city));
        query.with(Sort.by(Sort.Order.desc("sales")));
        query.with(PageRequest.of(0,size));
        List<Product> products = this.mongoTemplate.find(query, Product.class);
        return products;
    }
}
