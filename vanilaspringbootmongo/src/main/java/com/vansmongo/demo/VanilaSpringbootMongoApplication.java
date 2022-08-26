package com.vansmongo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.vansmongo.*" })
public class VanilaSpringbootMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanilaSpringbootMongoApplication.class);
	}

}
