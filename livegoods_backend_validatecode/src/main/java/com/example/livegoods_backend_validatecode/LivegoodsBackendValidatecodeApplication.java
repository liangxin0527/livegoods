package com.example.livegoods_backend_validatecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LivegoodsBackendValidatecodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsBackendValidatecodeApplication.class, args);
    }

}
