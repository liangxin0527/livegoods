package com.example.livegoods_fontend_userlogin.service.impl;

import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.example.livegoods_fontend_userlogin.feign.LoginServiceFeignClient;
import com.example.livegoods_fontend_userlogin.service.UserLoginService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Users;
import com.liangxin.pojo.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserLoginService {
    @Autowired
    private LoginServiceFeignClient loginServiceFeignClient;

    @Override
    @TccTransaction
    public LiveGoodsResult userLogin(Users users) {
        ValidateCode validateCode = this.loginServiceFeignClient.findByPhoneCode(users.getUsername(),users.getPassword());
        LiveGoodsResult result = new LiveGoodsResult();
        if(validateCode != null){
            Users user = this.loginServiceFeignClient.findUserByName(users.getUsername());
            if(user == null){
                users.setPassword("");
                int index = this.loginServiceFeignClient.insertUsers(users);
                if(index == 1){
                    int flag = this.loginServiceFeignClient.deleteByPhone(users.getUsername());
                    if(flag == 1){
                        result.setStatus(200);
                        result.put("msg","登录成功");
                        return result;
                    }
                }
            }else{
                result.setStatus(200);
                result.put("msg","登录成功");
                return result;
            }
        }
        result.setStatus(500);
        result.put("msg","登录失败");
        return result;
    }
}
