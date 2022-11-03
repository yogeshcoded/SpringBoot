package com.nt.Service;

import java.util.List;

import com.nt.entity.Actor;


public interface IActorMgmtService {

	public String removeActorByIdBatch(List<Integer> ids);
	public Actor searchActorByid(int aid);
	public List<Actor> searchAll();
	public List<Actor> searchActorByActor(Actor actor,boolean order,String...properties);

}
