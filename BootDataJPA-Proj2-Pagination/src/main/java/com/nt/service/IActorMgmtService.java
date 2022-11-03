package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	public Iterable<Actor> showActorByOrder(boolean asc,String...properties);
	public Page<Actor> showPageRecords(int pageNo,int pageSize);
	public Page<Actor> showPageByRecords(int pageNo,int pageSize);
	public void showActorRecords(int pageSize);
}
