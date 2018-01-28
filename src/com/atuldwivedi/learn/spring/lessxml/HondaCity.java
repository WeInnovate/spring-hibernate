package com.atuldwivedi.learn.spring.lessxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {
	
	private Engine engine;

	@Override
	public void driveTheCar() {
		engine.start();
		System.out.println("Driving "+this.getClass().getSimpleName());
		engine.stop();
	}

	public HondaCity(@Autowired @Qualifier("mercedesEngine") Engine engine) {
		super();
		this.engine = engine;
	}
	
	

}
