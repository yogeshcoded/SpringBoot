package com.nt.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;

import org.hibernate.annotations.ListIndexBase;

import lombok.Data;
@Data
@Entity
public class EmployeeInfo {
	@Id
	@GeneratedValue
private Integer eno;
private String ename;

@ElementCollection
@CollectionTable(name = "EMP_INFO_COLM",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "ENO"))
@OrderColumn(name="FRIEND_INDEX")
@Column(name="EMP_FRIENDS")
@ListIndexBase(1)
private List<String> friends;

@ElementCollection
@CollectionTable(name = "EMP_PHONES_COLM",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "ENO"))
@Column(name = "EMP_PHONENUMBRES")
private Set<Long> phoneNumbers ;

@ElementCollection
@CollectionTable(name = "EMP_DETAILS_COLM",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "ENO"))
@Column(name = "EMP_IDDETAILS")
@MapKeyColumn(name = "ID_TYPE")
private Map<String, Integer> idDetails;
} 
