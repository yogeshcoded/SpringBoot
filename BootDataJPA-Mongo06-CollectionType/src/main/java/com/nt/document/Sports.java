package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Document
@AllArgsConstructor
public class Sports {
		@Id
private Integer sId;
private String sname;
private String[] kitItems;
}
