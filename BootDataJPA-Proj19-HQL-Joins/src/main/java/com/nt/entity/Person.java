package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Table(name="PERSON_OTM_BI")
@Entity
public class Person implements Serializable {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private String paddrs;

	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, 
			                     fetch = FetchType.LAZY, mappedBy = "person",   orphanRemoval = true)
			                                                                               						                                                                              
	@LazyCollection(LazyCollectionOption.EXTRA)
	// @JoinColumn(name="PERSON_ID",referencedColumnName = "pid")
	private Set<PhoneNumber> phoneNumbers;

	public Person() {
		System.out.println("Person::0-param constructor  " + this.getClass());
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}

}// class
