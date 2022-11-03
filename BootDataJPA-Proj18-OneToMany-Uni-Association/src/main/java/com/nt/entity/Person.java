package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
public class Person implements  Serializable {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private String paddrs;
	
	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
	@JoinColumn(name="PERSON_ID",referencedColumnName = "pid")
	private Set<PhoneNumber> phoneNumbers;

	@Override
	public String toString() {
		return "Person (pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "\n"+  phoneNumbers+ ")";
				
	}

	
	
}// class
