package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bankService")
public class BankServiceImpl implements IBankService {

	@Override
	public double calSimpleIntrestAmount(double pamt, double rate, double time) {
		System.out.println("BankServiceImpl.calSimpleIntrestAmount()");
		return pamt * rate * time / 100;
	}

	@Override
	public double calCompoundIntrestAmount(double pamt, double rate, double time) {
		System.out.println("BankServiceImpl.calCompoundIntrestAmount()");
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}

}
