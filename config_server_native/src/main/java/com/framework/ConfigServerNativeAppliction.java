package com.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// 声明配置中心
@EnableConfigServer
public class ConfigServerNativeAppliction {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerNativeAppliction.class, args);
    }
}
