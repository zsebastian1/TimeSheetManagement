package com.springboot.timemanagement;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.springboot.timemanagement.dao")
@SpringBootApplication
public class TimeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TimeApplication.class, args);
	}

}