package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.respositary.IActorRepository;

@Service("actorService")
public class ActorMgmtServieImpl implements IActorMgmtService {
	@Autowired
	private IActorRepository repo;

	@Override
	public Iterable<Actor> showActorByOrder(boolean asc, String... properties) {
		// prepare sort object
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC);
		// get record by sorting
		Iterable<Actor> it = repo.findAll(sort);
		return it;
	}

	@Override
	public Page<Actor> showPageRecords(int pageNo, int pageSize) {
		// create pagable object
		Pageable pagable = PageRequest.of(pageNo, pageSize);
		// create page object
		Page<Actor> page = repo.findAll(pagable);
		return page;
	}// method

	@Override
	public void showActorRecords(int pageSize) {
		long recordsCount = repo.count();
		long pageCount = recordsCount / pageSize;
		pageCount = (recordsCount % pageSize == 0)?pageCount:pageCount++;
		for (int i = 0; i < pageCount; ++i) {
			Pageable pagable = PageRequest.ofSize(pageSize);
			Page<Actor> page = repo.findAll(pagable);
			System.out.println("Total page records "+page.getTotalElements());
			System.out.println((i + 1)+ "  Page Records");
			page.getContent().forEach(System.out::println);
		} // for
	}// method
	
	@Override
	public Page<Actor> showPageByRecords(int pageNo, int pageSize) {
		// create Pageable object
				//Pageable pagable = PageRequest.of(pageNo, pageSize,Sort.by("aid"));
				Pageable pagable2 = PageRequest.of(pageNo, pageSize, Direction.DESC,"aid");
				// create page object
				Page<Actor> page = repo.findAll(pagable2);
				return page;
	}
	
}// class
