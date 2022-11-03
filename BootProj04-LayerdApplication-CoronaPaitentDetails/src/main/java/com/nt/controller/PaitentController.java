package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Paitent;
import com.nt.service.IPaitentService;
@Controller("pController")
public class PaitentController {
@Autowired
	private IPaitentService service;

public List<Paitent> showAllDetailByState(String state1,String state2,String state3)throws Exception{
	//use service 
	List<Paitent>list=service.fetchPaitentDetailByState(state1, state2, state3);
	return list;
	
}
}
