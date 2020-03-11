package com.example.livegoods_backend_banner.controller;


import com.example.livegoods_backend_banner.service.BannerService;
import com.liangxin.pojo.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banner")
public class BannerController {


    @Autowired
    private BannerService bannerServicel;


    @RequestMapping("/findBannerAll")
    public List<Banner> findBanner(){
        return this.bannerServicel.findBannerAll();
    }
}
