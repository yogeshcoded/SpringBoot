package com.nt;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01BasicDiApplication {

	@Bean(name = "ldt")
	public LocalDateTime createDT() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		// get ioc
		ApplicationContext ctx = SpringApplication.run(BootProj01BasicDiApplication.class, args);
		// get target obj
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		// invoke b.mrthod
		String result = generator.wishMessage("raja");
		System.out.println(result);
		// close container
		((ConfigurableApplicationContext) ctx).close();
	}// main

}// class
