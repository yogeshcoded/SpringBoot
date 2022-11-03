package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	private Long acno;
	private String holdername;
	private Double balance;

}
