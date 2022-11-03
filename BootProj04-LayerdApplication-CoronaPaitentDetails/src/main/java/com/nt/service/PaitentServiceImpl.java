package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IPaitentDAO;
import com.nt.model.Paitent;

@Service("pService")
public class PaitentServiceImpl implements IPaitentService {
	@Autowired
	private IPaitentDAO dao;

	@Override
	public List<Paitent> fetchPaitentDetailByState(String state1, String state2, String state3) throws Exception {
		//use DAO
		List<Paitent>list=dao.getPaitentDetailByState(state1, state2, state3);
		return list;
	}

}
