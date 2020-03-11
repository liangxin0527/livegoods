package com.example.livegoods_frontend_search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
@EnableCaching
public class LivegoodsFrontendSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsFrontendSearchApplication.class, args);
    }

}
