package com.casestudy.profilemanagementmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableEurekaServer
@SpringBootApplication
public class ProfileManagementMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileManagementMicroserviceApplication.class, args);
	}

}
