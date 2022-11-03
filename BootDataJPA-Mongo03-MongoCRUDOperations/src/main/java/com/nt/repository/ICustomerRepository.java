package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.document.Customer;

public interface ICustomerRepository extends MongoRepository<Customer, String> {
public List<Customer> findCutomerByPriceBetween(int startPrice,int endPrice);
	
@Query("select cname,qty,price from Customer where _id=:id")
public List<Object[]> searchCutometByCid(String id);

}
