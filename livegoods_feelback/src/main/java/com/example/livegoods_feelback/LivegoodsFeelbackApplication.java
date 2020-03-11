package com.example.livegoods_feelback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LivegoodsFeelbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsFeelbackApplication.class, args);
    }

}
