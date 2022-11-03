package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;
@Controller("payroll")
public class PayrollOperationController {
	
@Autowired
	private IEmployeeService service;
public PayrollOperationController() {
	System.out.println("PayrollOperationController::0- param constructor");
}

public List<Employee> showAllEmplyeeDesgs(String desg1,String desg2,String desg3)throws Exception{
System.out.println("PayrollOperationController.showAllEmplyeeDesgs()");
//use service
	List<Employee> list=service.fetchAllEmployeesDesgs(desg1, desg2, desg3);
return list;
	}//method
}//class
