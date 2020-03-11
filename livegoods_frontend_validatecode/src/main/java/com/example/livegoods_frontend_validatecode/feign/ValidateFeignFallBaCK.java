package com.example.livegoods_frontend_validatecode.feign;

import com.liangxin.pojo.ValidateCode;
import org.springframework.stereotype.Component;

@Component
public class ValidateFeignFallBaCK implements  ValidateFeignClent{
    @Override
    public int insertValidateCode(ValidateCode validateCode) {
        return 0;
    }
}
