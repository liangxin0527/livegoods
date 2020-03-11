package com.example.livegoods_backend_search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LivegoodsBackendSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsBackendSearchApplication.class, args);
    }

}
