package com.atuldwivedi.learn.spring.lessxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hj")
public class HondaJazz implements Car {
	
	private Engine engine;

	@Override
	public void driveTheCar() {
		engine.start();
		System.out.println("Driving "+this.getClass().getSimpleName());
		engine.stop();
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	@Qualifier("mercedesEngine")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
