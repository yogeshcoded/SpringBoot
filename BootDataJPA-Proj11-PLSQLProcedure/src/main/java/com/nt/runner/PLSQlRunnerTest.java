package com.nt.runner;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;

@Component
public class PLSQlRunnerTest implements CommandLineRunner {
	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		// create store procedure object having PLSQL procedure name,result
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_ACTOR_BY_CATEGPRY", Actor.class);
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.REF_CURSOR);
		// set value in param
		query.setParameter(1, "Hero");
		query.setParameter(2, "bega");
		// call pl/sql procedure
		List<Actor> list = query.getResultList();
		list.forEach(System.out::println);

	}

}
