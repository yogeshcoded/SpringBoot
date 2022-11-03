package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.document.Customer;
import com.nt.repository.ICustomerRepository;

@Service("custService")
public class CustomerMgmtService implements ICustomerMgmtService {
	@Autowired
	private ICustomerRepository custRepo;

	@Override
	public String saveCustomerInfo(Customer cust) {
		return "Customer is registerd " + custRepo.insert(cust).getId();
	}

	@Override
	public List<Customer> fetchCustomerInfo() {
		return custRepo.findAll();
	}

	@Override
	public List<Customer> saveAllCustomer(List<Customer> cust) {
			return custRepo.saveAll(cust);
	}
	
	@Override
	public String searchCustometById(String id) {
		Optional<Customer> opt = custRepo.findById(id);
		if (opt.isEmpty()) {
			return "Customer not found";
		} else
			return opt.get().toString();
		
	}

	@Override
	public String updateCustometByInfo(String id, int newQty) {
		Optional<Customer> opt = custRepo.findById(id);
		if (opt.isEmpty())
			return "Cutomer not found";
		else {
			Customer cust =opt.get();
			cust.setQty(newQty);
			custRepo.save(cust);
			return "Cutomer is update";
		}//else
	}// method
	
	@Override
	public String removeCustometByInfo(String id) {
		Optional<Customer> opt=custRepo.findById(id);
		if(opt.isEmpty()) 
			return "customer not found";
		else {
			custRepo.deleteById(id);
			return "Cutomer is delete by given id" ;
		}


	}

	@Override
	public List<Customer> showAllCustomer(boolean asc, String... properties) {
		//create sort object
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		List<Customer>list=custRepo.findAll(sort);
		return list;
	}
	
}//class
