package com.nt.repository;

import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Actor;
@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {
	@Query(nativeQuery = true,value = "INSERT INTO ACTOR VALUES(ACTOR_SEQ.NEXTVAL,?,?,?)")
	@Modifying
	public int insertActor(String name,String role,long phoneno);
	
	@Query(nativeQuery = true , value = "SELECT SYSDATE FROM DUAL")
	public Date showDate();
}
