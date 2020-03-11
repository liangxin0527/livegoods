package com.example.livegoods_house_buyaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class LivegoodsHouseBuyactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsHouseBuyactionApplication.class, args);
    }

}
