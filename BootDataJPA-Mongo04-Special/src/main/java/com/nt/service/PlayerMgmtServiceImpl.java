package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.PlayerInfo;
import com.nt.repository.IPlayerRepository;

@Service("pServie")
public class PlayerMgmtServiceImpl implements IPlayerMgmtService{
	@Autowired
private IPlayerRepository repo;
	
	@Override
	public String savePlayersInfo(PlayerInfo info) {
		return "Player are save with id val :: " + repo.insert(info).getPid();
	}

}
