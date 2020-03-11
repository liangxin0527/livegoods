package com.example.livegoods_frontend_validatecode.service.impl;

import com.example.livegoods_frontend_validatecode.feign.ValidateFeignClent;
import com.example.livegoods_frontend_validatecode.service.ValidateCodeService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.ValidateCode;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {
    @Autowired
    private ValidateFeignClent validateCodeFeignClient;

    //短信平台相关参数
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    private String appId = "104724";
    private String appSecret = "c0241440-8d84-4ca2-83a9-1de43212ab30";

    @Override
    public LiveGoodsResult validateCode(ValidateCode validateCode) {
        //可使用短信平台生成验证码，模拟生成。
        ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
        String code2 = String.valueOf(new Random().nextInt(999999));
        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("message", "lbaci给您发登陆提示-->>>>验证码为: " + code2);
            params.put("number", validateCode.getPhone());
            validateCode.setCode(code2);
            String send = client.send(params);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
            String format = sdf.format(new Date());
            validateCode.setTime(sdf.parse(format));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int flag = this.validateCodeFeignClient.insertValidateCode(validateCode);
        LiveGoodsResult result = new LiveGoodsResult();
        result.setStatus(200);
        if (flag != 1) {
            result.setStatus(500);
        }
        return result;
    }
}
