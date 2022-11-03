package com.nt.document;

import java.util.Map;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document
@Data
@AllArgsConstructor

public class Player {
	@Id
	private Integer pid;
	private String pname;
	private String paddrs;
	private Set<Sports> sports;
	private Map<String, Medals> medal;

}
