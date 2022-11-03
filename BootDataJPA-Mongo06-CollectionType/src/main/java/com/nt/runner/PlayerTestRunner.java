package com.nt.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Medals;
import com.nt.document.Player;
import com.nt.document.Sports;
import com.nt.service.ISportMgmtService;
@Component
public class PlayerTestRunner implements CommandLineRunner{
	@Autowired
	private ISportMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
		//create sports object
		Sports sp1=new Sports(new Random().nextInt(1000),"tennies",new String[]{"racket","ball","net"});
		Sports sp2=new Sports(new Random().nextInt(1000),"batminttan",new String[]{"racket","t.ball","net"});
		
		//create medal object 
		Medals medal1 =new Medals("olympic-gold", "Gold", "Tokeyo-olympic-gold", "tokeyo");
		Medals medal2 =new Medals("cwg-silver", "silver", "cwg-olympic-gold", "tokeyo");
		
		// create Player object
		Player player =new Player(new Random().nextInt(10000),"Sindhu","hyd",
				Set.of(sp1,sp2),
				Map.of("medal1",medal1,"medal2",medal2)
				);
		
		System.out.println(service.savePlayersWithSportsAndMedals(player));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
