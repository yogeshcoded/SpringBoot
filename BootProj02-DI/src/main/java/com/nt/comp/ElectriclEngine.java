package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectriclEngine implements IEngine {
	public ElectriclEngine() {
		System.out.println("ElectriclEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("ElectriclEngine::Started");
	}

	@Override
	public void stop() {
		System.out.println("ElectriclEngine::Stop");
	}

}
