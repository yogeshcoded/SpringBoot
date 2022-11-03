package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Emp;
import com.nt.repository.IEmpRepository;


@Component
public class EmpRunnerTest implements CommandLineRunner {
	@Autowired
	private IEmpRepository emp;

	@Override
	public void run(String... args) throws Exception {
		Iterable<Emp> it=emp.getAllEmpDetails(7499);
		it.forEach(System.out::println);
		
		List<Emp> list=emp.getEmpHireDateByEno(7499);
		list.forEach(System.out::println);
			

	}

}
