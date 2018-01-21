package com.atuldwivedi.learn.spring.javaclass;

import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {

	@Override
	public void driveTheCar() {
		System.out.println("Driving "+this.getClass().getSimpleName());
	}

}
