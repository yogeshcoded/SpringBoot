package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootProj07YmlApplication {

	public static void main(String[] args) {
		//get application IOC container
	ApplicationContext ctx=SpringApplication.run(BootProj07YmlApplication.class, args);
	Customer cust=ctx.getBean("cust",Customer.class);
	System.out.println(cust);
	//close container
	((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
