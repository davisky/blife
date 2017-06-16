package com.blife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class SleuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthServiceApplication.class, args);
	}
}
