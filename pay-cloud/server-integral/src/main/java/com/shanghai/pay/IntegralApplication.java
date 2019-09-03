package com.shanghai.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 14:05
 */
@EnableDiscoveryClient
@SpringBootApplication
public class IntegralApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegralApplication.class, args);
    }
}
