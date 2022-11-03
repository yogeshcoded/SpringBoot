package com.nt.sbeans;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("cust")
@ConfigurationProperties(prefix = "com.nt")
@Data
public class Customer {
	private Integer cid;
	private String cname;
	private String addrs;
	private Integer billAmt;

}
