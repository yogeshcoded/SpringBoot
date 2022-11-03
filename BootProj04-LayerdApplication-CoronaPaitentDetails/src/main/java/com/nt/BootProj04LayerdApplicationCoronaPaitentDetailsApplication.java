package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PaitentController;
import com.nt.model.Paitent;

@SpringBootApplication
public class BootProj04LayerdApplicationCoronaPaitentDetailsApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj04LayerdApplicationCoronaPaitentDetailsApplication.class,
				args);
		// get controller obj ref
		PaitentController controller = ctx.getBean("pController", PaitentController.class);
		// invoke the b.method
		try {
			List<Paitent> list = controller.showAllDetailByState("Tripura", "Maharashtra", "UP");
			list.forEach(paitent->{System.out.println(paitent);});
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close container
		((ConfigurableApplicationContext) ctx).close();

	}// main
}// class
