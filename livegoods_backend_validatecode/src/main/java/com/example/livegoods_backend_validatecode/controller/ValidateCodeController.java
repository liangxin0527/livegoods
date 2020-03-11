
package com.example.livegoods_backend_validatecode.controller;

import com.example.livegoods_backend_validatecode.service.ValidateService;
import com.liangxin.pojo.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validateCode")
public class ValidateCodeController {
    @Autowired
    private ValidateService validateCodeService;

    @RequestMapping("/insertCode")
    public int insertValidateCode(@RequestBody ValidateCode validateCode){
        return this.validateCodeService.addValidateCode(validateCode);
    }
}
