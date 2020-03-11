package com.example.livegoods_backend_userlogin.controller;

import com.example.livegoods_backend_userlogin.service.ValidateCodeService;
import com.liangxin.pojo.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class ValidateCodeController {

    @Autowired
    private ValidateCodeService validateCodeService;

    @RequestMapping("/findByPhoneCode")
    public ValidateCode findByPhoneCode(String phone, String code){
        return this.validateCodeService.selectByPhoneCode(phone, code);
    }
    @RequestMapping("/deleteByPhone")
    public int deleteByPhone(String phone){
        return this.validateCodeService.deleteByPhone(phone);
    }
}
