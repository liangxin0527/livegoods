package com.example.livegoods_backend_banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LivegoodsBackendBannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsBackendBannerApplication.class, args);
    }

}
