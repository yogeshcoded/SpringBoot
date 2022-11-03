package com.nt.service;

import java.util.List;

import com.nt.document.Customer;

public interface ICustomerMgmtService {
public String saveCustomerInfo(Customer cust);
public List<Customer> fetchCustomerInfo();
public List<Customer> saveAllCustomer(List<Customer> cust);
public String searchCustometById(String id);
public String updateCustometByInfo(String id,int newQty);
public String removeCustometByInfo(String id);
public List<Customer> showAllCustomer(boolean asc,String...properties);
}
