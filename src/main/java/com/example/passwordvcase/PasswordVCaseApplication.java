package com.example.passwordvcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.example.service",
		"com.example.controller"
})
public class PasswordVCaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordVCaseApplication.class, args);
	}

}
