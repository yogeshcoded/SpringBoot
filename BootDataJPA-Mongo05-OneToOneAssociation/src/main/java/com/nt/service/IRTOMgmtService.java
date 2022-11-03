package com.nt.service;

import java.util.List;

import com.nt.document.DrivingLIcense;
import com.nt.document.Person;

public interface IRTOMgmtService {
public String saveDataUsingPerson(Person per);
public String saveDataUsingDL(DrivingLIcense lIcense);

public List<Person> fetchDataUsingPerson();
public List<DrivingLIcense> fetchDataUsingChild();
}
