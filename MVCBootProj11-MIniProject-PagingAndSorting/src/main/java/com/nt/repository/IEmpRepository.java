package com.nt.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;

public interface IEmpRepository extends PagingAndSortingRepository<Employee, Integer> {

}
