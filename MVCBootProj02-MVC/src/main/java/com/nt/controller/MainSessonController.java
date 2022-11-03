package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISessionFinderService;

@Controller
public class MainSessonController {
	@Autowired
	private ISessionFinderService service;
	
	@RequestMapping("/")
public String launchHome() {
		System.out.println("MainSessonController.launchHome()");
	return"welcome";
}
	
	@RequestMapping("/season")
	public String getSeason(Map<String,Object> map) {
		//use service
		String msg=service.findSeason();
		//keep result in LVN
		map.put("season", msg);
		//return LVN
		return "display";
		
	}
}//class
