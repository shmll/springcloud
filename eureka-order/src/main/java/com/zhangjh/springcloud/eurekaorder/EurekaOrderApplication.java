package com.zhangjh.springcloud.eurekaorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderApplication.class, args);
    }
}
