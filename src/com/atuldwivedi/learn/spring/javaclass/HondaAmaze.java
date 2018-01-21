package com.atuldwivedi.learn.spring.javaclass;

import org.springframework.stereotype.Component;

@Component("hondaAm")
public class HondaAmaze implements Car {

	@Override
	public void driveTheCar() {
		System.out.println("Driving "+this.getClass().getSimpleName());
	}

}
