package com.atuldwivedi.learn.spring.lessxml;

import org.springframework.stereotype.Component;

@Component("hondaAm")
public class HondaAmaze implements Car {

	@Override
	public void driveTheCar() {
		System.out.println("Driving "+this.getClass().getSimpleName());
	}

}
