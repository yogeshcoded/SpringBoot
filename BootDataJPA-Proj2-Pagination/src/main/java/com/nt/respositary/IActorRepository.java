package com.nt.respositary;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer> {

}
