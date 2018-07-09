package com.proxy.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiMaestrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiMaestrosApplication.class, args);
    }
}
