package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj06ConfigurationPropertyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj06ConfigurationPropertyApplication.class, args);
		Hotel hotel = ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		((ConfigurableApplicationContext) ctx).close();

	}// main

}// class
