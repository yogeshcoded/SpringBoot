package com.nt.service;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String wishMessageGenerator() {
	return "Good Afternoon";
	}

}
