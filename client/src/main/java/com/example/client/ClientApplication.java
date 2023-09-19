package com.example.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@EnableFeignClients
public class ClientApplication implements CommandLineRunner {

	private final SomeFeignClient someFeignClient;

	public ClientApplication(SomeFeignClient someFeignClient) {
		this.someFeignClient = someFeignClient;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ClientApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}

	@Override
	public void run(String... args) {
		System.out.println("Console application");
		System.out.println("someFeignClient: " + someFeignClient);
		System.out.println("ping...: " + someFeignClient.ping());
	}


}
