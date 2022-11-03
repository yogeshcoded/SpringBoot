package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	//b.method
	public String wishMessage(String user) {
		System.out.println("WishMessageGenerator.wishMessage()");
	int hour=ldt.getHour();
	if(hour<12)
	      return "Good Morning  "+user;
	else if(hour<12)
		return "Good Afternoon  "+user;
	else if(hour<12)
		return "Good Evening  "+user;
	else
		return "Good NIght  "+user;
	
	}//wishMesage(--)

}//class
