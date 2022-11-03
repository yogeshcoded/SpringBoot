package com.nt.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	private Integer sal;
	private Integer comm;
	private Integer deptno;
}
