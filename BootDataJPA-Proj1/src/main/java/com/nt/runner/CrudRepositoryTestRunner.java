package com.nt.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IActorMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		//Actor actor = new Actor();
		/*	try {
				actor.setActorName("RaviTeja");
				actor.setCategaery("test");
				actor.setMobile(994444448L);
				// invoke b.method
				String resultmsg = service.registerActorInfo(actor);
				System.out.println(resultmsg);
			} catch (DataAccessException dae) {
				dae.printStackTrace();
			}*/
		// =======================================Save All====================
	try {
				List<Actor> actorList=List.of(new Actor("Ranveer","SperHero",9845777777L),
			                                                    new Actor("Alia","LeadActress",9846584444L),
			                                                    new Actor("bhava","Spotboy",9845779685L),
			                                                    new Actor("chivi","makup",9845896485L));
			    // invoke b.method
				String resultmsg =service.registerGroupActor(actorList);
				System.out.println(resultmsg);
			} catch (DataAccessException dae) {
				dae.printStackTrace();
			}
		// ======================================= findAll by id ====================
	/*	try {
			Iterable<Actor> i1 = service.fetchAllActorById(5);
			i1.forEach(act -> System.out.println(act)); // java 8 feature

			System.out.println("==================================================");
			i1.forEach(System.out::println); // java 8 feature with static method reference

			System.out.println("================================================================");
			List<Actor> list = (List<Actor>) i1;
			System.out.println("Counting Employee:  " + list.stream().count());
			System.out.println("===========================================");
			System.out.println("Sorting records:  ");
			list.stream().sorted(Comparator.comparing(actor1 -> actor1.getAid()))
			                     .forEach(System.out::println);
			System.out.println("===========================================");
			System.out.println("Sorting records by name:  ");
			list.stream().sorted((a1, a2) -> a1.getActorName().compareTo(a2.getActorName()))
					             .forEach(System.out::println);
			System.out.println("===========================================");
			List<String> nameList = list.stream().map(actor2 -> actor2.getActorName())
					                                                      .collect(Collectors.toList());
			nameList.forEach(System.out::println);
			System.out.println("===========================================");
		
		} catch (DataAccessException e) {
			e.printStackTrace();
		}*/
		// ======================================= find by id ====================
		/*try {
			String actorList=service.fetchActorById(1);
			System.out.println(actorList);
		}
		catch(DataAccessException e) {
			e.printStackTrace();
		}*/
		/*try {
		Optional<Actor>opt=service.fetchActorEById(3);
		if(opt.isPresent())
		   System.out.println("Actor jnfo::  " +opt.get());
		else
		   System.out.println("actor not found");
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println("=============================================================");	
		try {
		Optional<Actor>opt1=service.fetchActorEById(18);
		Actor actor=opt1.orElseThrow(()->new IllegalArgumentException("Actor not found"));
		 System.out.println("actor info "+actor);
		}
		catch(DataAccessException dae) {
		dae.printStackTrace();
		}
		System.out.println("=============================================================");	
		try {
		Optional<Actor>opt2=service.fetchActorEById(20);
		if(opt2.isEmpty())
			System.out.println("actor not found");
		else
			System.out.println("Actor Info ::  "+opt2.get());
		}
		catch(DataAccessException dae) {
		dae.printStackTrace();
		}*/
	
		// ======================================= count ====================
		/*	try {
				String aCount = service.countActorsNo();
				System.out.println(aCount);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
//======================================= existById  =======================
		/*try {
			boolean available = service.isAvailable(5);
			System.out.println(available);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	
		/*System.out.println("======================================= showById  =======================");
			System.out.println("Actor info:::   "+service.showActorById(2));*/
		
		/*System.out.println("==================================  partial update  =======================");
			System.out.println("Actor update  info:::   "+service.updateActor(53, 9848512678L));
			*/
		
		/*System.out.println("================================== fully object  update  =======================");
		                                Actor actor=new Actor(4, "jani", "villen", 1234567890L);
		        System.out.println("Actor update  info:::   "+service.updateActorInfo(actor));*/
	
		/*  System.out.println("================================== Register or Update  =======================");
		  Actor actor1=new Actor(5, "Radha", "sita", 6120547890L);
		  System.out.println("Actor   info:::   "+service.registerOrUpdate(actor1));*/
			        
          //======================================= DeleteById  =======================
									//		System.out.println(service.RemoveActorById(54));
				

   //======================================= Delete()  ============================
	/*	Actor actor =new Actor(53,"","",95474L);
	System.out.println(service.remove(actor));*/
				
//======================================= deletebyid  ============================			
	/*		System.out.println(service.RemoveActorById(21));	*/

				
				
	}//run(-,-)
		}//class