package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document("Person_OTO")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Person {
	@Id
	@NonNull
	private Integer pid;
	@NonNull
	private String pname;
	@NonNull
	private String paddrs;
	private DrivingLIcense drivingLIcense;

	@Override
	public String toString() {
		return "Person(pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + ")";
	}

}
