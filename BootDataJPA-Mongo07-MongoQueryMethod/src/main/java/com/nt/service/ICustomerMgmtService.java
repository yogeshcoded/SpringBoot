package com.nt.service;

import java.util.List;

import com.nt.document.Customer;

public interface ICustomerMgmtService {
public List<Object[]> getCustomerDetails(int cid);

public List<Customer> getAllCustomerinfo(int cid);

public List<Customer> getAllCustomerDetailByQtyAndPrice(int qty,int price);

public List<Customer> getAllCustomerDataByPriceRange(int start,int end);

public List<Customer> getAllCustomerDataByCnames(String name1,String name2);

public List<Customer> getAllCustomerDataByInitalCharacters(String chart);
}
