package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("emp")
@ConfigurationProperties(prefix = "org.nt")
public class Employee {
	private Integer eid;
	private String ename;
	//collection properties
	private String[] favColors;
	
	private List<String>nicknames;
	private Set<Long>mobileNo;
	private Map<String,Object>idDetails;

}
