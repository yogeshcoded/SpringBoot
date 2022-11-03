package com.nt;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.entity.Actor;
import com.nt.respositary.IActorRepository;
@DisplayName("Tesing Methods")
@SpringBootTest
class BootJpaProj1ApplicationTests {

	@Autowired
	private IActorRepository repo;

	/*
	 * 1.test save operation
	* 
	*/

	 @Test
	 @Disabled
	public void testRegister() {
		Actor sActor =new Actor(null,"raman","spotboy",9999999999L);
	     sActor=repo.save(sActor);
	    assertNotNull(sActor.getAid(), "registration failed");
			}

	/*
	 *2. test display all operation
	 */

	@Test
	@Disabled
	public void testfetchAll() {
	List<Actor> list=(List<Actor>) repo.findAll();
		assertNotNull(list);
		if(list.isEmpty()) {
			fail("Records not found");
		}
	}//testfetch
		

	@Test
	@DisplayName("checking")
	public void testavilablle() {
		assertTrue(repo.existsById(2), "Record not found");

	}

}// class
