package com.example.livegoods_frontend_banner.controller;

import com.example.livegoods_frontend_banner.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("/banner")
    public Object showBanner(){
        return this.bannerService.findBannerAll();
    }

}
