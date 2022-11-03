package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "Customer_Info")
@Data

public class Customer {
	@Id
	private String id;
	private Integer cno;
	private String cname;
	private Integer qty;
	private Integer price;

}
