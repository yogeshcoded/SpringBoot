package com.nt.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinkServiceImpl implements ILinkService {

	@Override
	public String wishMassageGeneerator() {
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour<12) 
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<20)
			return "Good Evening";
		else
		return "Good Night";
	}

	@Override
	public Set<String> fetchAllLanguages() {
	Locale locale[]=Locale.getAvailableLocales();
	Set<String> langSet=new HashSet();
	for(Locale i:locale) {
		langSet.add(i.getDisplayLanguage());
	}
		return langSet;
	}

}
