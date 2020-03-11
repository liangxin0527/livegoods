package com.example.livegoods_frontend_byrecommen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class LivegoodsFrontendByrecommenApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsFrontendByrecommenApplication.class, args);
    }

}
