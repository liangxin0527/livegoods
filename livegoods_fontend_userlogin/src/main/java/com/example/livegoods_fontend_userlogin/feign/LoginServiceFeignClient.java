package com.example.livegoods_fontend_userlogin.feign;

import com.liangxin.pojo.Users;
import com.liangxin.pojo.ValidateCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "backenduesrloginservice",fallback = LoginServiceFeignClientFallback.class)
public interface LoginServiceFeignClient {

    @RequestMapping("/login/insertUsers")
    int insertUsers(@RequestBody Users users);

    @RequestMapping("/login/findUserByName")
    Users findUserByName(@RequestParam String username);

    @RequestMapping("/login/findByPhoneCode")
    ValidateCode findByPhoneCode(@RequestParam String phone, @RequestParam String code);

    @RequestMapping("/login/deleteByPhone")
    int deleteByPhone(@RequestParam String phone);
}
