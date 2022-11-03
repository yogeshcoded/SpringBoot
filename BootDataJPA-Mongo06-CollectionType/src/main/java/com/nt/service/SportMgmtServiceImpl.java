package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repository.IMedalRepository;
import com.nt.repository.IPlayerRepository;
import com.nt.repository.ISportRepository;

@Service("pServie")
public class SportMgmtServiceImpl implements ISportMgmtService {
	@Autowired
	private IPlayerRepository pRepo;
	@Autowired
	private ISportRepository sRepo;
	@Autowired
	private IMedalRepository mRepo;

	@Override
	public String savePlayersWithSportsAndMedals(Player player) {
			return "Player are save with id "+pRepo.save(player).getPid();
	}


	
}
