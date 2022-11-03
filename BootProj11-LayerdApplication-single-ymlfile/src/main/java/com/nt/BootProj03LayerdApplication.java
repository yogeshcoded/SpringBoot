package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayrollOperationController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayerdApplication {
	@Autowired
	private Environment env;

	@Bean(name = "c3p0DS")
	@Profile("test")
	public ComboPooledDataSource createC3P0DS() throws Exception {
		System.out.println("BootProj03LayeredAppApplication.createC3P0DS()");
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		cpds.setUser(env.getRequiredProperty("spring.datasource.username"));
		cpds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		cpds.setInitialPoolSize(Integer.parseInt(env.getRequiredProperty("c3p0.minsize")));
		cpds.setMaxPoolSize(Integer.parseInt(env.getRequiredProperty("c3p0.maxsize")));
		return cpds;
	}

	public static void main(String[] args) {
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj03LayerdApplication.class);
		// get controller class obj ref
		PayrollOperationController controller = ctx.getBean("payroll", PayrollOperationController.class);
		// invoke the b.methods
		try {
			List<Employee> list = controller.showAllEmplyeeDesgs("CLERK", "SALESMAN", "MANAGER");
			// process result

			list.forEach(emp -> {
				System.out.println(emp);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class