package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.DrivingLIcense;

public interface IDrivingLicenseRepository extends MongoRepository<DrivingLIcense, Long> {

}
