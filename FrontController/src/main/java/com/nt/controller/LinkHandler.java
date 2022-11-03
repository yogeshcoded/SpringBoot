package com.nt.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.nt.service.ILinkService;
import com.nt.service.LinkServiceImpl;

public class LinkHandler {
private ILinkService service;

public LinkHandler() {
	service=new LinkServiceImpl();
}

public String shoeWishMessage(HttpServletRequest req) {
	//use service
	String wmg=service.wishMassageGeneerator();
	//keep the result request scope
	req.setAttribute("wishmsg", wmg);
	return "wish_msg";
	
}
public String showAllLanguages(HttpServletRequest req) {
	//use service
	Set<String> langSet=service.fetchAllLanguages();
	req.setAttribute("language", langSet);
	return "langs";
}

}//controller
