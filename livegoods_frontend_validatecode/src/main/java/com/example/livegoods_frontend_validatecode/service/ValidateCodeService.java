package com.example.livegoods_frontend_validatecode.service;

import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.ValidateCode;

public interface ValidateCodeService {
    LiveGoodsResult validateCode(ValidateCode validateCode);
}
