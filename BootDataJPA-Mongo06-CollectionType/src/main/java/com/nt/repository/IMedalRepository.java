package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.document.Player;

public interface IMedalRepository extends MongoRepository<Player, Integer> {

}
