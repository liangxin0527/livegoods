package com.example.livegoods_frontend_banner.feign;

import com.liangxin.pojo.Banner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BannerServiceFeignClientFallback implements BannerServiceFeignClient{
    /*
     返回托底数据
     */
    @Override
    public List<Banner> findBannerAll() {
        return new ArrayList<>();
    }
}
