package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Customer;

public interface ICustomerRepository extends MongoRepository<Customer, String> {
	@Query(fields="{cname:1,qty:1,price:1}",value="{cno:?0}")
	public List<Object[]> getAllCustinfo(int cid);
	
	//@Query(fields="{}",value="{cno:?0}")
	@Query(value="{cno:?0}")
	public List<Customer> getAllCustomerinfo(int cid);
	
	
	@Query(value="{qty:?0,price:?1}")
	public List<Customer> getCustomerDataByQtyAndPrice(int qty,int price);
	
	
	//@Query(value="{price:{$gte:?0},price:{$lte:?1}}")
	@Query(value="{price:{$gte:?0,$lte:?1}}")
	public List<Customer> getCustomerDataByPriceRange(int start,int end);
	
	@Query(value="{$or:[{cname:?0},{cname:?1}]}")
	public List<Customer> getCustomerDataByCnames(String name1,String name2);
	
	@Query(value="{cname:{'$regex':?0,'$options':'i'}}")
	//@Query(value="{ename:{'$regex':?0}}")
	public List<Customer> getCustomerDataByInitalCharacters(String chart);
	
	
	
	
	
	
	
	
	
	
}
