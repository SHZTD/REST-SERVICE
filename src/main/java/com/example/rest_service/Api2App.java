package com.example.rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Api2App {

	public static void main(String[] args) {
		SpringApplication.run(Api2App.class, args);
	}

}

/*
	CREATE USER 'sevenfour'@'%' IDENTIFIED BY 'eightfour';
	GRANT ALL PRIVILEGES ON usuaris.* TO 'sevenfour'@'%';
	FLUSH PRIVILEGES;
 */