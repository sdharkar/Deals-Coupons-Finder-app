package com.couponservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CouponServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponServiceApplication.class, args);
	}
}

//http://localhost:8083/swagger-ui.html#/coupon-microservice
