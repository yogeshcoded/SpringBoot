package com.nt.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.repository.ICustomerRepository;

@Service("custService")
public class CustomerMgmtService implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepository custRepo;

	@Override
	public String saveCustomerInfo(Customer cust) {
				return "Customer save  with id  "+custRepo.insert(cust).getId();
	}

	
	
}//class
