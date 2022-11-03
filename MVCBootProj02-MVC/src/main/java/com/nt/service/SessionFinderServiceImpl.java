package com.nt.service;


import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service("seasonService")
public class SessionFinderServiceImpl implements ISessionFinderService {

	@Override
	public String findSeason() {
	//get month from Date Time
		LocalDate dt = LocalDate.now();
		int month = dt.getMonthValue();
//get the season based on month
		if (month >= 2 && month <= 5)
			return "Summer Season";
		else if (month >= 5 && month <= 9)
			return "Rainy Season";
		else
			return "Winter Season";
}
}
