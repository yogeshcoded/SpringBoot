package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.repository.ICustomerRepository;

@Service("custService")
public class CustomerMgmtService implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepository custRepo;

	@Override
	public List<Object[]> getCustomerDetails(int cid) {
		return custRepo.getAllCustinfo(cid);
	}

	@Override
	public List<Customer> getAllCustomerinfo(int cid) {
		return custRepo.getAllCustomerinfo(cid);
	}

	@Override
	public List<Customer> getAllCustomerDetailByQtyAndPrice(int qty, int price) {
		return custRepo.getCustomerDataByQtyAndPrice(qty, price);
	}
	
	@Override
	public List<Customer> getAllCustomerDataByPriceRange(int start, int end) {
		
		return custRepo.getCustomerDataByPriceRange(start, end);
	}

	@Override
	public List<Customer> getAllCustomerDataByCnames(String name1, String name2) {
		
		return custRepo.getCustomerDataByCnames(name1, name2);
	}

	@Override
	public List<Customer> getAllCustomerDataByInitalCharacters(String chart) {
	
		return custRepo.getCustomerDataByInitalCharacters(chart);
	}
	
	
	
	
	
	
	
}// class
