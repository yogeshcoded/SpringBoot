package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IBankService;

public class AroundAdviceTest {
	public static void main(String[] args) {
		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/applicationContext.xml");
		// get proxy class objec
		IBankService service = ctx.getBean("bankService", IBankService.class);
		System.out.println(service.getClass()+"           "+service.getClass().getSuperclass());
		// invoke the b.method
		System.out.println("SI Amount :  " +service.calSimpleIntrestAmount(100000.0, 2.5, 12.0));
		
		System.out.println("==============================");
		
		System.out.println("CI Amount :  " +service.calCompoundIntrestAmount(100000.0, 3.0, 12.0));
		
		
	}
}
