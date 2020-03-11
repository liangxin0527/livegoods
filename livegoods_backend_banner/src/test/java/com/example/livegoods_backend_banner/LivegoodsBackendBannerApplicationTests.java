package com.example.livegoods_backend_banner;

import com.example.livegoods_backend_banner.service.BannerService;
import com.liangxin.pojo.Banner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LivegoodsBackendBannerApplicationTests {

    @Autowired
    private BannerService bannerService;

    @Test
    void contextLoads() {
        List<Banner> bannerAll = bannerService.findBannerAll();
        bannerAll.stream().forEach(name-> System.out.println(name.getPath()));
    }

}
