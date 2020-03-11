package com.example.livegoods_frontend_banner.feign;

import com.liangxin.pojo.Banner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(value = "backendserver",fallback = BannerServiceFeignClientFallback.class )
public interface BannerServiceFeignClient {
    @RequestMapping("/banner/findBannerAll")
    List<Banner> findBannerAll();

}
