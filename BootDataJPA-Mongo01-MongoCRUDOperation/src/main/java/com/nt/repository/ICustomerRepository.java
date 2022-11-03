package com.nt.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Customer;

public interface ICustomerRepository extends MongoRepository<Customer, String> {

	

}
