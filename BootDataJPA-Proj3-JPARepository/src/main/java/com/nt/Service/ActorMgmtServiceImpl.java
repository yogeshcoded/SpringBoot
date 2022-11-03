package com.nt.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.Repository.IActorRepository;
import com.nt.entity.Actor;
@Service("actorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {
@Autowired
	private IActorRepository repo;
	@Override
	public String removeActorByIdBatch(List<Integer> ids) {
		List<Actor> list=repo.findAllById(ids);
		int count=list.size();
		repo.deleteAllByIdInBatch(ids);
		return count+"";
	}
	@Override
	public Actor searchActorByid(int aid) {
		return repo.getReferenceById(aid);
	}
	
	@Override
		public List<Actor> searchAll() {
			List<Actor> list=repo.findAll(Sort.by("aid"));
			return list;
		}
	
@Override
	public List<Actor> searchActorByActor(Actor actor, boolean order, String... properties) {
		// create Example object
	Example example=Example.of(actor);
 // sort
Sort sort=Sort.by(order?Direction.ASC:Direction.DESC,properties);
List<Actor> list=repo.findAll(example, sort);
		return list;
	}
}
