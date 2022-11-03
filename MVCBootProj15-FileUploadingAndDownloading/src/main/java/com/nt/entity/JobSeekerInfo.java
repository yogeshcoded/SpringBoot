package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="BOOT_JOB")
public class JobSeekerInfo implements Serializable {
	@Id
	@GeneratedValue
	private Integer jsId;
	private String jsName;
	private String JsAddrs;
	private String resumePath;
	private String photoPath;
	
}
