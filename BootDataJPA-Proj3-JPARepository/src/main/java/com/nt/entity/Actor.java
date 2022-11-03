package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor

public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aid;
	private String actorName;
	private String categaery;
	private Long mobile;

	public Actor() {
		System.out.println("Actor::0-param constuctor");
	}
}
