package com.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

// 包含了@EnableZullServer(成为网关),设置该类是网关的启动类
@EnableZuulProxy
// 帮助Srping boot 应用将所有符合条件的配置configuration配置加载到当前Srping boot 创建并使用的ioc容量中,自动装载配置
@EnableAutoConfiguration
public class ZuuGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuuGatewayApplication.class, args);
    }

}
