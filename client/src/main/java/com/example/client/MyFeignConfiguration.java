package com.example.client;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class MyFeignConfiguration {
    @Bean
    public Logger.Level feignLoggerLevel() {
        System.out.println("feignLoggerLevel");
        return Logger.Level.FULL; // Configure the Feign client logger level
    }
}
