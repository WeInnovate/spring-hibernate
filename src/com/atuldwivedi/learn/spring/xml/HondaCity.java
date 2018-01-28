package com.atuldwivedi.learn.spring.xml;

public class HondaCity implements Car {

	private long modelNumber;

	private String color;

	private double mileAge;

	private int maxSpeed;
	
	private Engine engine;

	@Override
	public void driveTheCar() {
		engine.start();
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName() + " with speed of " + maxSpeed
				+ " which has model number " + modelNumber + " and mileage " + mileAge);
	engine.stop();
	}

	public long getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(long modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileAge() {
		return mileAge;
	}

	public void setMileAge(double mileAge) {
		this.mileAge = mileAge;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public HondaCity(Engine engine) {
		super();
		this.engine = engine;
	}

}
