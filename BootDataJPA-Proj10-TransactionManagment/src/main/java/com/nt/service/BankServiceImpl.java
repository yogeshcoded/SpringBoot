package com.nt.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IAccountRepository;

@Service("bankService")
public class BankServiceImpl implements IBankService {
	@Autowired
	private IAccountRepository repo;

	@Override
	@Transactional
	public String transferMoney(long srcAcno, long destAcno, double amount) {
	         int wtdraw=repo.withdrawMoney(srcAcno, amount);
	         int credit=repo.depositeMoney(destAcno, amount);
	         if(wtdraw==0 || credit==0)
	        	 throw new RuntimeException("Problem to transferring money");
		return "Amount "+amount+ "  is Transper from A/c No "+srcAcno+" to A/c No " +destAcno ;
	        	                                                                       
	}

}
