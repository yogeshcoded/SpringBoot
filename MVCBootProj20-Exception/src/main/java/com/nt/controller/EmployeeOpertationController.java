package com.nt.controller;

import java.util.Map;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.exception.EmployeeNotFoundException;
import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;



@Controller
public class EmployeeOpertationController {
	@Autowired
	private IEmployeeMgmtService service;

	@GetMapping("/")
	public String launchHome() {
		System.out.println("EmployeeOpertationController.launchHome()");
		// return LVN
		return "home";
	}



	

	
}
