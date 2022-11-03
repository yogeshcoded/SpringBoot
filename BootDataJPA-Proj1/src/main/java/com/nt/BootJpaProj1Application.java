package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootJpaProj1Application {

	public static void main(String[] args) {
		// get IOC container
		SpringApplication.run(BootJpaProj1Application.class, args);

	}
}
