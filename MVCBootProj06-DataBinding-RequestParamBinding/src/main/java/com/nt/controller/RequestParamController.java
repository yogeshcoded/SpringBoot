package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {
	/*	@GetMapping("/data")
		public String process(@RequestParam("sno")int no, @RequestParam("sname")String name) {
			System.out.println(no+"    "+name);
			//return LVN
			return "show_result";
		}*/
	
	/*	@GetMapping("/data")
		public String process(@RequestParam int sno, @RequestParam String sname) {
			System.out.println(sno+"    "+sname);
			//return LVN
			return "show_result";
		}*/
	
	/*@GetMapping("/data")
	public String process(@RequestParam int sno, @RequestParam(required = false) String sname) {
		System.out.println(sno+"    "+sname);
		//return LVN
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam int sno, @RequestParam(defaultValue = "ps1") String sname) {
		System.out.println(sno+"    "+sname);
		//return LVN
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public String process(@RequestParam(defaultValue = "2001") int sno, @RequestParam String sname) {
		System.out.println(sno+"    "+sname);
		//return LVN
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public String process1(@RequestParam(required = false) Integer sno, @RequestParam(defaultValue = "ps1") String sname) {
		System.out.println(sno+"    "+sname);
		//return LVN 
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public String process1(@RequestParam("sno") Integer sno, 
			                               @RequestParam("sname") String sname, 
			                               @RequestParam("saddrs") String saddrs[], 
	                                       @RequestParam("saddrs") List<String> saddList ,
	                                        @RequestParam("saddrs") Set<String>saddSet)
	{
		System.out.println(sno+"    "+sname+"   "+Arrays.toString(saddrs)+" "+saddList+"   "+saddSet);
		//return LVN 
		return "show_result";
	}*/
	
	@GetMapping("/data")
	public String process1(@RequestParam("sno") Integer sno, 
			                               @RequestParam("sname")String sname,
	                                       @RequestParam("saddrs")String saddrs){
		System.out.println(sno+"    "+sname+"   "+saddrs);
		//return LVN 
		return "show_result";
	}
}
