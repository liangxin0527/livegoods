package com.example.livegoods_frontend_byhot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringCloudApplication
@EnableFeignClients
public class LivegoodsFrontendByhotApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsFrontendByhotApplication.class, args);
    }

}
