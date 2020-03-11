package com.example.livegoods_frontend_banner.service.impl;

import com.example.livegoods_frontend_banner.feign.BannerServiceFeignClient;
import com.example.livegoods_frontend_banner.service.BannerService;
import com.liangxin.commons.LiveGoodsResult;
import com.liangxin.pojo.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerServiceFeignClient bannerServiceFeignClient;

    @Value("${fastdfs_host}")
    private String fastdfs_host;
    @Override
    public LiveGoodsResult findBannerAll() {
        List<Banner> find = this.bannerServiceFeignClient.findBannerAll();
        find.stream().forEach(name-> System.out.println(name.getPath()));
        LiveGoodsResult result = new LiveGoodsResult();
        result.setStatus(200);
        List<String> list = new ArrayList<>();
        for(Banner banner:find){
            list.add(this.fastdfs_host+banner.getPath());
        }
        result.put("results",list);
        return result;
    }
}

