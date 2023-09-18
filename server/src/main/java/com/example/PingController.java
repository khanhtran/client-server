package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class PingController {
    @GetMapping("/ping")
    public String ping() throws InterruptedException {
        Thread.sleep(8000);
        return "PONG";
    }
}
