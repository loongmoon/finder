package com.zhao.finder;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@Slf4j
@EnableEurekaServer
public class FinderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinderApplication.class, args);
        log.info("finder启动成功!");
    }
}
