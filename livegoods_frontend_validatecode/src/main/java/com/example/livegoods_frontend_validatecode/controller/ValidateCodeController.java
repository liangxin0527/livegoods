package com.example.livegoods_frontend_validatecode.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.livegoods_frontend_validatecode.service.ValidateCodeService;
import com.liangxin.pojo.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Member;
import java.util.Random;

@RestController
public class ValidateCodeController {
    @Autowired
    private ValidateCodeService validateCodeService;



    @PostMapping("/sendyzm")
    public Object validateCode(ValidateCode validateCode){
        return this.validateCodeService.validateCode(validateCode);
    }




}
