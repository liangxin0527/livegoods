package com.example.livegoods_backend_userlogin.dao;

import com.liangxin.pojo.ValidateCode;

public interface ValidateCodeDao {
    /**
     * 根据手机和验证码查询是否正确
     * 作用：
     * 用户登录时判断手机号和验证码是否正确
     */
    ValidateCode selectByPhoneCode(String phone, String code);

    /*
    根据手机号删除document
    作用：
        用户登录成功后，删除验证码信息
     */
    int deleteByPhone(String phone);

    /*
    根据手机号查询document
    作用：
        用户登录成功后，删除验证码信息，为了保证事务能回滚，需要先查询验证码信息
     */
    ValidateCode selectByPhone(String phone);

    /*
    新增验证码信息
    作用：
        事务回滚时把删除数据，新增回来
     */
    ValidateCode insert(ValidateCode validateCode);
}
