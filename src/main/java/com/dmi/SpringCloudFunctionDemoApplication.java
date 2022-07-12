package com.dmi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudFunctionDemoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudFunctionDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionDemoApplication.class, args);
		LOGGER.info("Spring Cloud Function Demo Application Started");
	}
}
