package com.example.livegoods_frontend_validatecode.feign;

import com.liangxin.pojo.ValidateCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "backendvalidatecode" ,fallback = ValidateFeignFallBaCK.class)
public interface ValidateFeignClent {
    @RequestMapping("/validateCode/insertCode")
    int insertValidateCode(@RequestBody ValidateCode validateCode);

}
