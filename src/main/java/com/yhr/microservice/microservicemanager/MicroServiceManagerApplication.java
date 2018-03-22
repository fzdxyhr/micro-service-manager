package com.yhr.microservice.microservicemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroServiceManagerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceManagerApplication.class, args);
	}
}
