package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.comp.IEngine;

@Component("vehicle")

public class Vehicle {
	@Autowired
	@Qualifier("eng")
	private IEngine engine;
	
	public Vehicle() {
	System.out.println("Vehicle::0-param constructor");
	}

	// b.method
	public void journey(String startpoint, String stoppoint) {
		engine.start();
		System.out.println("Vehicle.journey()");
		System.out.println("journey is on going ::" + startpoint);

		engine.stop();
		System.out.println("journey is stop ::  " + stoppoint);

	}

}
