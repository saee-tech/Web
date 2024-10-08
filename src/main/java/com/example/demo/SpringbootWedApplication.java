       package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springjspdemo")
public class SpringbootWedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWedApplication.class, args);
	}

}
