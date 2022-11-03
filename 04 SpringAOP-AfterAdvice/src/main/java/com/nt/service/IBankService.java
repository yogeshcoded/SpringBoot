package com.nt.service;

public interface IBankService {
	public double calSimpleIntrestAmount(double pamt, double rate, double time);
	public double calCompoundIntrestAmount(double pamt, double rate, double time);
}
