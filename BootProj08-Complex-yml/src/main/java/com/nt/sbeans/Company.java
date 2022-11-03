package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp")
public class Company {
	private Integer cid;
	private String cname;
	private String addrs;
	private Integer size;
	

}
