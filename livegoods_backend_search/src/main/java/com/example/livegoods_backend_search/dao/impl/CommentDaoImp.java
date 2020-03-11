package com.example.livegoods_backend_search.dao.impl;

import com.example.livegoods_backend_search.dao.CommentDao;
import com.liangxin.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;

@Repository
public class CommentDaoImp implements CommentDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Comment> selectCommentByHid(String hid, int page, int size) {
        Query query = new Query(Criteria.where("hid").is(hid));
        query.with(PageRequest.of(0,size));
        return this.mongoTemplate.find(query,Comment.class);

    }
    @Override
    public long count(String hid) {
        Query query = new Query(Criteria.where("hid").is(hid));
        return this.mongoTemplate.count(query,Comment.class);
    }

}
