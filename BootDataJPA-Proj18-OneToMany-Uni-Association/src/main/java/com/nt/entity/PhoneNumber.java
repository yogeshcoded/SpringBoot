package com.nt.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
public class PhoneNumber  implements  Serializable{
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "PHONE_ID", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	private Long phoneNumer;
	private String phone_type;
	private String provider;
	@Override
	public String toString() {
		return "PhoneNumber (regNo=" + regNo + ", phoneNumer=" + phoneNumer + ", phone_type=" + phone_type
				+ ", provider=" + provider + ")";
	}

	
}// class
