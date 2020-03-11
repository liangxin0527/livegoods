package com.example.livegoods_backend_validatecode.dao.impl;

import com.example.livegoods_backend_validatecode.dao.ValidateDao;
import com.liangxin.pojo.ValidateCode;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ValidateDaoImpl implements ValidateDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public ValidateCode insertCode(ValidateCode validateCode) {
        System.out.println(validateCode);
        return this.mongoTemplate.insert(validateCode);
    }
}
