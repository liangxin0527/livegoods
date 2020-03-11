package com.example.livegoods_frontend_validatecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class LivegoodsFrontendValidatecodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsFrontendValidatecodeApplication.class, args);
    }

}
