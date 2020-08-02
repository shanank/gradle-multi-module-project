package com.training.gradle.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class GradleMultiModuleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleMultiModuleProjectApplication.class, args);
	}

}
