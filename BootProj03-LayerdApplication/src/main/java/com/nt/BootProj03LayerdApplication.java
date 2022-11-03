package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayerdApplication {

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj03LayerdApplication.class, args);
		// get conteoller class obj ref
		PayrollOperationController controller = ctx.getBean("payroll", PayrollOperationController.class);

		// invoke the b.methods
		try {
			List<Employee> list = controller.showAllEmplyeeDesgs("CLERK", "MANAGER", "ANALYST");
			// process result
			
			list.forEach(emp->{System.out.println(emp);});
		} catch (Exception e) {
			e.printStackTrace();
		}
//close container
		((ConfigurableApplicationContext) ctx).close();
	}// main
}// class