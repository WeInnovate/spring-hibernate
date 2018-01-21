package com.atuldwivedi.learn.spring.xml;

public class HondaCity implements Car {

	@Override
	public void driveTheCar() {
		System.out.println("Driving "+this.getClass().getSimpleName());
	}

}
