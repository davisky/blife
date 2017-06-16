package com.blife;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class CloudAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAdminServiceApplication.class, args);
	}
}
