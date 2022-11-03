package com.nt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	public  List<Actor> findByActorNameEquals(String name);
	
	public  List<Actor> findByActorNameIs(String name);

	public  List<Actor> findByCategoryOrActorName(String name,String category);
	
	public  Iterable<Actor> findByCategoryAndActorName(String name,String category);

     public  Iterable<Actor> findByActorNameEndingWith(String name);

      public  Iterable<Actor> findByActorNameLike(String name);

      public Iterable<Actor> findByAidBetween( int start,int end);

      public Iterable<Actor> findByActorNameNotNull();

      public Iterable<Actor> findByActorNameNull();

      public Iterable<Actor> findByCategoryEqualsIgnoreCase(String category);

      public Iterable<Actor> findByActorNameContainingIgnoreCase(String name);








}