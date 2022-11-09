package com.nt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "EMPID_SEQ", initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empno;
	private String ename;
	private String job;
	private Integer sal;
	private Integer deptno;
}
