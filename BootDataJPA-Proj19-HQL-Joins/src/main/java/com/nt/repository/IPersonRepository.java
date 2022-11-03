package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
//@Query("select p.pid,p.pname,p.paddrs,e.regNo,e.phoneNumer,e.phone_type,e.provider from Person p inner join p.phoneNumbers e  ")
//	@Query("select p.pid,p.pname,p.paddrs,e.regNo,e.phoneNumer,e.phone_type,e.provider from Person p left join p.phoneNumbers e  ")
//@Query("select p.pid,p.pname,p.paddrs,e.regNo,e.phoneNumer,e.phone_type,e.provider from Person p right join p.phoneNumbers e  ")
@Query("select p.pid,p.pname,p.paddrs,e.regNo,e.phoneNumer,e.phone_type,e.provider from Person p full join p.phoneNumbers e  ")
	public List<Object[]> fetchDataUsingPersonByJoin();
}
