package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Document
@AllArgsConstructor
public class Medals {
	@Id
private String mid;
private String mname;
private String event;
private String place;


}
