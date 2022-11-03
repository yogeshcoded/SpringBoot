package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeInfo;
import com.nt.repository.ICollectionMappingRepo;
@Service("empService")
public class CollectionMappingServiceImpl implements ICollectionMappingService {
	@Autowired
		private ICollectionMappingRepo repo;

	@Override
	public String registerEmpInfo(EmployeeInfo info) {
		return repo.save(info).getEno()+" Emploeee Register Successfully";
	}

	

}
