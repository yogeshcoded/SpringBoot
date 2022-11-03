package com.nt.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerOprationController {
	@GetMapping("/")
	public String homeLaunch() {
		return "home";
	}

	@GetMapping("register")
	public String registerFormPageLauncher(@ModelAttribute("cust") Customer cust) {
		System.out.println("CustomerOprationController.registerFormPageLauncher()");
		return "register_cust";
	}

	@PostMapping("register")
	public String registerFormPageSubmission(@ModelAttribute("cust") Customer cust, Map<String, Object> map) {
		System.out.println("CustomerOprationController.registerFormPageSubmission()");
		map.put("custInfo", cust);
		return "show_report";
	}

	@InitBinder
	public void myBinder(ServletRequestDataBinder binder) {
		System.out.println("CustomerOprationController.myBinder()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));

	}

}// class
