package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("hotel")
@Data
public class Hotel {
	@Value("12345")
	private Integer hid;
	@Value("${hotel.hname}")
	private String hname;
	@Value("${hotel.haddrs}")
	private String haddrs;
	@Value("${hotel.mobileNo}")
	private Long mobileNo;
	
	@Value("#{menu.idlyPrice+menu.dosaPrice +menu.vadapavPrice}")
	private Integer billAmt;

}
