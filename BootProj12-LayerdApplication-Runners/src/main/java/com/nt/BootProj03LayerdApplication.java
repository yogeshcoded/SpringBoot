package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj03LayerdApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj03LayerdApplication.class, args);
		((ConfigurableApplicationContext) ctx).close();
		
	}// main
}// class