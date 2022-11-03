package com.nt.service;

import com.nt.entity.Person;

public interface IPersonService {
public String registerPersonInfo(Person info);
public Person fetchPersonByPid(int pid);
}
