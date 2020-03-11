package com.example.livegoods_backend_userlogin.service.impl;

import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.example.livegoods_backend_userlogin.dao.ValidateCodeDao;
import com.example.livegoods_backend_userlogin.service.ValidateCodeService;
import com.liangxin.pojo.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {
    @Autowired
    private ValidateCodeDao validateCodeDao;

    @Override
    public ValidateCode selectByPhoneCode(String phone, String code) {
        return this.validateCodeDao.selectByPhoneCode(phone, code);
    }

    /**
     * MongoDB只能使用TCC事务模式。删除之前先查询要删除的数据，把数据放入到全局ConcurrenthashMap
     *
     * @param phone
     * @return
     */
    @Override
    @TccTransaction
    public int deleteByPhone(String phone) {
        ValidateCode validateCode = this.validateCodeDao.selectByPhone(phone);
        int index = this.validateCodeDao.deleteByPhone(phone);
        return index;
    }

    /**
     * 事务回滚时调用该方法
     *
     * @param phone
     */

    public void cancelDeleteByPhone(String phone) {
        ValidateCode validateCode = this.validateCodeDao.selectByPhone(phone);
        this.validateCodeDao.insert((validateCode));
    }
}
