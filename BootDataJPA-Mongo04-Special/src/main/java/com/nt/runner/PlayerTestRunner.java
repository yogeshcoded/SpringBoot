package com.nt.runner;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PlayerInfo;
import com.nt.service.IPlayerMgmtService;
@Component
public class PlayerTestRunner implements CommandLineRunner{
	@Autowired
	private IPlayerMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		// create Player object
		PlayerInfo info =new PlayerInfo();
		info.setPid(new Random().nextInt(10000));
		info.setPname("Virat"); info.setPaddrs("Mohali");
		info.setFriends(new String[] {"Rohit","Jadeja","Raina","Hardik"});
		info.setPhoneNumber(Set.of(9999999L,8888888L,252525252L));
		info.setNickNames(List.of("chiku","sir","viru"));
		info.setImpKoncks(Map.of("T20 cup","40 runs","Aisacup","35 runs"));
		Properties props=new Properties();
		props.put("aadharcard", "45128954");
		props.put("pancard", "CIP4587KO0");
		info.setIdDetails(props);
	
		System.out.println(service.savePlayersInfo(info));
		
	}

}
