package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "my-api", url = "http://localhost:8080", configuration = MyFeignConfiguration.class)
public interface SomeFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/ping")
    String ping();
}
