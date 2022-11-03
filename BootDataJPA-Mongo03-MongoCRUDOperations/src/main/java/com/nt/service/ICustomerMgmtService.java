package com.nt.service;

import java.util.List;

import com.nt.document.Customer;

public interface ICustomerMgmtService {
public List<Customer> searchCutomerByPriceBetween(int startPrice,int endPrice);
public List<Object[]> getCutometByCid(String id);
}
