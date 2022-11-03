//Actor.java
package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Actor {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@NonNull
	private String actorName;
	@NonNull
	private String category;
	@NonNull
	private Long mobile;
	

}
