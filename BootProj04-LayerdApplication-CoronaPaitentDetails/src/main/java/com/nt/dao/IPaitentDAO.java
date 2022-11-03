package com.nt.dao;

import java.util.List;

import com.nt.model.Paitent;

public interface IPaitentDAO {
public  List<Paitent> getPaitentDetailByState(String state1,String state2,String state3)throws Exception;


}
