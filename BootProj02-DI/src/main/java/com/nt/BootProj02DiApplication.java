package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfg/applicationContext.xml")
public class BootProj02DiApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj02DiApplication.class, args);
		// get target class
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
		// invoke b.method
		vehicle.journey("Hyd", "Mum");
		// close the container
		((ConfigurableApplicationContext) ctx).close();
	}// main
}// class
