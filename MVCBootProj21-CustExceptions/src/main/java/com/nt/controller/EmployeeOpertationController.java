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

import com.nt.exception.PDFNotFountExcetpion;
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

	@GetMapping("/emp_report")
	public String generateEmployeeReport(Map<String, Object> map,@RequestParam("type")String type)throws Exception {
		System.out.println("EmployeeOpertationController.showEmployeeReport()");
		Iterable<Employee> itEmp = service.fetchAllEmployee();
		map.put("empsList", itEmp);
		// return LVN
		if(type.equalsIgnoreCase("pdf"))
			throw new PDFNotFountExcetpion("upload file failes");
		else
			return "excelreport";
	}

	
}
