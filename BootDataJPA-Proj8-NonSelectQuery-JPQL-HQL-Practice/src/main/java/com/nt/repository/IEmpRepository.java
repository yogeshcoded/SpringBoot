//IEmpRepository.java
package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Emp;

public interface IEmpRepository extends JpaRepository<Emp, Integer> {

	@Query("from Emp where empno=:eno")
	public Iterable<Emp> getAllEmpDetails(int eno);

	@Query("select hiredate from Emp where empno=:eno")
	public List<Emp> getEmpHireDateByEno(int eno);

}