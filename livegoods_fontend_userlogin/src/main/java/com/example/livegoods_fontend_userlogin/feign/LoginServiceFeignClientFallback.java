package com.example.livegoods_fontend_userlogin.feign;

import com.liangxin.pojo.Users;
import com.liangxin.pojo.ValidateCode;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceFeignClientFallback implements LoginServiceFeignClient {
    @Override
    public int insertUsers(Users users) {
        return 0;
    }

    @Override
    public Users findUserByName(String username) {
        return null;
    }

    @Override
    public ValidateCode findByPhoneCode(String phone, String code) {
        return null;
    }

    @Override
    public int deleteByPhone(String phone) {
        return 0;
    }
}
