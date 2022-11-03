package com.nt.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Table(name="PHONENO_OTM_BI")
@Entity
public class PhoneNumber implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "PHONE_ID", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	private Long phoneNumer;
	private String phone_type;
	private String provider;

	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PID")
	@LazyToOne(LazyToOneOption.FALSE)
	private Person person;

	public PhoneNumber() {
		System.out.println("PhoneNumber::0-param constructor  " + this.getClass());
	}

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNumer=" + phoneNumer + ", phone_type=" + phone_type
				+ ", provider=" + provider + "]";
	}

}// class
