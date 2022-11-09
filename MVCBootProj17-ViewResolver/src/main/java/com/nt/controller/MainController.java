package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.IWishMessageService;

@Controller
public class MainController {
	@Autowired
	private IWishMessageService service;
	
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/result")
	public String  genearateWishMsg(Map<String , Object>map) {
		String result=service.wishMessageGenerator();
		map.put("resultMsg", result);
		return "display";
		
	}

}
