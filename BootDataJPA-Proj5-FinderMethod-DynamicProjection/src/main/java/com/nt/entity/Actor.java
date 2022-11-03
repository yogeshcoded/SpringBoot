package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Actor {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
private Integer aid;
private String actorName;
private String category;
private Long mobile;

}
