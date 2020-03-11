package com.example.livegoods_backend_validatecode.service.impl;

import com.example.livegoods_backend_validatecode.dao.ValidateDao;
import com.example.livegoods_backend_validatecode.service.ValidateService;
import com.liangxin.pojo.ValidateCode;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateServiceimpl implements ValidateService {
    @Autowired
    private ValidateDao validateDao;
    @Override
    public int addValidateCode(ValidateCode validateCode) {
        ValidateCode validateCode1 = this.validateDao.insertCode(validateCode);

        return validateCode1==null?0:1;
    }
}
