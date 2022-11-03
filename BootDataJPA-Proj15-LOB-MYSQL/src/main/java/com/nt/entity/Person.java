package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
@Data
@Entity
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
 private Integer pid;
 private String pname;
 private LocalDateTime dob;
 private boolean married;
 @Lob
 private byte[] photo;
 @Lob
 private char[] resume;
 
}
