package com.nt.model.offer;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;
@Data
@Entity
@Table(name="MDS_OFFER")
public class Offer {
	@Id
	@SequenceGenerator(name = "gen1" ,initialValue =1,allocationSize = 1,sequenceName = "oid_seq")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
private Integer oid;
	@NonNull
private String offerName;
	@NonNull
private Double discount;
	@NonNull
private LocalDateTime ltd;
}
