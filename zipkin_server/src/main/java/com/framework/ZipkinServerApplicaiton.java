package com.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.ZipkinServer;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
// 声明启动zipkin server
@EnableZipkinServer
public class ZipkinServerApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplicaiton.class, args);
    }
}
