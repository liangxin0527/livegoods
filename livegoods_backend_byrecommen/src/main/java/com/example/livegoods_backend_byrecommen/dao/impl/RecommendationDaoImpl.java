package com.example.livegoods_backend_byrecommen.dao.impl;

import com.example.livegoods_backend_byrecommen.dao.RecommendationDao;
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
public class RecommendationDaoImpl implements RecommendationDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Product> findRecommendation(String city, int size) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("city").is(city),Criteria.where("recommendation").is(true));
        query.addCriteria(criteria);
        query.with(Sort.by(Sort.Order.asc("recoSort")));
        query.with(PageRequest.of(0,size));

        return mongoTemplate.find(query,Product.class);
    }
}
