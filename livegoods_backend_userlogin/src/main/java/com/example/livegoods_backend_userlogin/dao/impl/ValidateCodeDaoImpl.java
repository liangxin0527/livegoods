package com.example.livegoods_backend_userlogin.dao.impl;

import com.example.livegoods_backend_userlogin.dao.ValidateCodeDao;
import com.liangxin.pojo.ValidateCode;
import com.mongodb.client.result.DeleteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ValidateCodeDaoImpl implements ValidateCodeDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public ValidateCode selectByPhoneCode(String phone, String code) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("phone").is(phone),Criteria.where("code").is(code));
        query.addCriteria(criteria);
        return this.mongoTemplate.findOne(query,ValidateCode.class);
    }

    @Override
    public int deleteByPhone(String phone) {
        Query query = new Query(Criteria.where("phone").is(phone));
        DeleteResult result = this.mongoTemplate.remove(query,ValidateCode.class);
        return (int)result.getDeletedCount();
    }

    @Override
    public ValidateCode selectByPhone(String phone) {
        Query query = new Query(Criteria.where("phone").is(phone));
        return this.mongoTemplate.findOne(query,ValidateCode.class);
    }

    @Override
    public ValidateCode insert(ValidateCode validateCode) {
        return this.mongoTemplate.insert(validateCode);
    }
}
