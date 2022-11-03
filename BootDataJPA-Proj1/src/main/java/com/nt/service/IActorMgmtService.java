package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	// save operations
	public String registerActorInfo(Actor actor);

	public String registerGroupActor(List<Actor> list);

	// select operation
	public String fetchActorById(int aid);

	public Actor showActorById(int aid);

	public Optional<Actor> fetchActorEById(int aid);

	public Iterable<Actor> fetchAllActorById(int aid);

	// checking operation
	public String countActorsNo();

	public boolean isAvailable(int aid);

	// update opreations
	// partially update
	public String updateActor(int aid, Long newMobileNo);

	// fully update
	public String updateActorInfo(Actor actor);

	// saveOrupdate method
	public String registerOrUpdate(Actor actor);

	// delete operations
	public String RemoveActorById(int aid);
	public String RemoveActorByAId(int aid);
	public String RemoveAllActorByAId(List<Actor> actor);
	public String remove(Actor actor);
}
