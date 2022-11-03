package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerOperator {
@GetMapping("/")
	public String homePage() {
		//return LVN
		return "home";
	}
}
