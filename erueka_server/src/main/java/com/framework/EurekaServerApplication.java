package com.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// https://www.bilibili.com/video/BV1p4411K7pz?p=5
// 声明该类是spring boot的服务启动入口
@SpringBootApplication
// 声明该类是一个服务注册中心,提供服务注册和服务发现功能
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);
    }
}
