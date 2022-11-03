package com.nt.model.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="MDS_PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer pid;
	@NonNull
private String pname;
	@NonNull
private Double qty;
	@NonNull
private Double price;

}
