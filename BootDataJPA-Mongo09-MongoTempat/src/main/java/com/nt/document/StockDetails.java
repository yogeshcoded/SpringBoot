package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Document("STOCK")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockDetails {
	@Id
private Integer stockid;
private String stockName;
private Integer price;
private String exchangeName;

}
