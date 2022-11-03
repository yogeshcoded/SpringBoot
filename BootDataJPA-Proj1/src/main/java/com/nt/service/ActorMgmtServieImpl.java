package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.respositary.IActorRepository;

@Service("actorService")
public class ActorMgmtServieImpl implements IActorMgmtService {
	@Autowired
	private IActorRepository repo;

	@Override
	public String registerActorInfo(Actor actor) {
		Actor sactor = repo.save(actor);
		return "Actor is register successfully   " + sactor.getAid();
	}

//=====================without java8 feature====================
	/*@Override
	public String registerGroupActor(List<Actor> list) {
		if(list!=null) {
		Iterable<Actor> sActor=repo.saveAll(list);
		List<Integer> ids=new ArrayList();
		for(Actor actor:sActor) {
		ids.add(actor.getAid());
		}//for
		return ids.size()+"id values "+ids;
	}//if
	return "Problem to batch registration";
		
	}*/
//=====================using java8 stream api feature====================
	@Override
	public String registerGroupActor(List<Actor> list) {
		if (list != null) {
			List<Actor> sActor = (List<Actor>) repo.saveAll(list);
			List<Integer> ids = sActor.stream().map(actor -> actor.getAid()).collect(Collectors.toList());
			return ids.size() + "  Objects are save having id's are   " + ids;
		} // if
		return "Problem to batch registration";

	}// method(-,-)
//========================================   find by id  ===============================

	@Override
	public String fetchActorById(int aid) {
		Optional<Actor> aList = repo.findById(aid);
		return " Actor info as" + aList;
	}
	@Override
	public Optional<Actor> fetchActorEById(int aid) {
		Optional <Actor>opt=repo.findById(aid);
		return opt;
	}
	//========================================   findAll by id  ===============================	
	@Override
	public Iterable<Actor> fetchAllActorById(int aid) {
		return repo.findAll();
	}
	//========================================   show by id  ===============================	
	/*@Override
	public Actor showActorById(int aid) {
		Optional<Actor> opt5=repo.findById(aid);
		if(opt5.isPresent())
			return opt5.get(); 
		else
			throw new IllegalArgumentException("Acotr not found");
		}*/
	
	/*@Override
	public Actor showActorById(int aid) {
		Optional<Actor> opt5=repo.findById(aid);
		return opt5.orElseThrow(()->new IllegalArgumentException("Actor not found"));
			}*/
	
@Override
public Actor showActorById(int aid) {
	return repo.findById(aid).orElseThrow(()->new IllegalArgumentException("actor not found"));
}
//========================================   count  ===============================
	@Override
	public String countActorsNo() {
		Long count = repo.count();
		return "No of actord are::  " + count;
	}

//========================================   existbyId  ===============================
	@Override
	public boolean isAvailable(int aid) {
			return  repo.existsById(aid);
	}

//========================================   deletbyId  ===============================
		@Override
		public String RemoveActorById(int aid) {
			Optional<Actor> opt9=repo.findById(aid);
			if(opt9.isPresent()) {
			repo.deleteById(aid);
			return "Record Delete Successfully";
			}
			else
				return "Record not found for delete";
		};
//========================================   delete  ===============================		
		@Override
		public String remove(Actor actor) {
			boolean  status=repo.existsById(actor.getAid());
			if(status) {
				repo.delete(actor);
				return "Object is delete";
			}
			return "No Record Found for delete" ;
		}
		
//======================================= Delete ==================================
		@Override
		public String RemoveActorByAId(int aid) {
			repo.deleteById(aid);
			return aid+"Record Delete Successfully";
					};
//======================================= DeleteAllby entityes ==================================
					@Override
					public String RemoveAllActorByAId(List<Actor> actor) {
						repo.deleteAll(actor);
						return "delete given";
					}
		
//======================================= partial update ==================================
	@Override
	public String updateActor(int aid, Long newMobileNo) {
		Optional<Actor> opt=repo.findById(aid);
		if(opt.isPresent()) {
		Actor actor=opt.get();
		actor.setMobile(newMobileNo);
		repo.save(actor);
		return aid+" Actor  is update ";
		}
		else
		return "record not found for update";
	}
//======================================= fully update ==================================
	@Override
	public String updateActorInfo(Actor actor) {
		boolean present=repo.existsById(actor.getAid());
		if(present) {
			repo.save(actor);
					return actor.getAid()+" Mobile Number is update ";
		}
		else
			return "record not found for update";
	}
	//======================================= RegisterorUpdate ==================================	
@Override
public String registerOrUpdate(Actor actor) {
	Actor sActor=repo.save(actor);
	return sActor+"Actor is register or update";
}

}// class
