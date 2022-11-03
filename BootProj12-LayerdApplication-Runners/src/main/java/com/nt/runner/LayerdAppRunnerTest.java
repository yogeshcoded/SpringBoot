package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationController;
import com.nt.model.Employee;
@Component
public class LayerdAppRunnerTest implements CommandLineRunner {
@Autowired
	private PayrollOperationController controller;

public LayerdAppRunnerTest() {
	System.out.println("LayerdAppRunnerTest.::0- param constructor");
}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("LayerdAppRunnerTest.run()");
		// invoke the b.methods
				try {
					List<Employee> list = controller.showAllEmplyeeDesgs("CLERK", "MANAGER", "ANALYST");
					// process result
					
					list.forEach(emp->{System.out.println(emp);});
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

}
