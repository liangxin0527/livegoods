package com.example.livegoods_backend_userlogin.service;

import com.liangxin.pojo.ValidateCode;

public interface ValidateCodeService {
    ValidateCode selectByPhoneCode(String phone, String code);
    int deleteByPhone(String phone);
}
