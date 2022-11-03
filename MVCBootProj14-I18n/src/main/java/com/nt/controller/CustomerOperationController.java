package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerOperationController {
	@GetMapping("/")
	public String homePage(){
	return "home";
	}
	@GetMapping("/register")
	public String customerFormPageLaunch(@ModelAttribute("cust")Customer cust,
			                                                              Map<String, Object>map){
		return "register_cust";
	}
}
