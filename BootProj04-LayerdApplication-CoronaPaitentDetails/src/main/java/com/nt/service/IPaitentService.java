package com.nt.service;

import java.util.List;

import com.nt.model.Paitent;

public interface IPaitentService {
public List<Paitent> fetchPaitentDetailByState(String state1, String state2,String state3)throws Exception;

}
