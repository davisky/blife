package com.blife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignServiceApplication.class, args);
	}
}
