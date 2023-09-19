package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MySpringBootApplication.class, args);
    }
}