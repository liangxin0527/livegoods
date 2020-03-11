package com.example.livegoods_fontend_userlogin;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableDistributedTransaction
@EnableFeignClients
public class LivegoodsFontendUserloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivegoodsFontendUserloginApplication.class, args);
    }

}
