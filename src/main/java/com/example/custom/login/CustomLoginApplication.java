package com.example.custom.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
public class CustomLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomLoginApplication.class, args);
	}

}
