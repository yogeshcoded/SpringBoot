package com.nt.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.repository.ICustomerRepository;

@Service("custService")
public class CustomerMgmtService implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepository custRepo;

	@Override
	public List<Customer> searchCutomerByPriceBetween(int startPrice, int endPrice) {
		List<Customer> list= custRepo.findCutomerByPriceBetween(startPrice, endPrice);
		return list;
	}

	@Override
	public List<Object[]> getCutometByCid(String cid) {
			return custRepo.searchCutometByCid(cid);
	}

	
	

	
	
}//class
