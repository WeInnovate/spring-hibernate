package com.atuldwivedi.learn.spring.xml;

public class HondaJazz implements Car {

	private long modelNumber;

	private String color;

	private double mileAge;

	private int maxSpeed;

	private Engine engine;

	@Override
	public void driveTheCar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Driving ").append(color).append(" ").append(this.getClass().getSimpleName()).append(" at speed of ")
				.append(maxSpeed).append(" KMpH which has model number ").append(modelNumber).append(" and mileage of ")
				.append(mileAge).append(" KMpL");

		engine.start();
		System.out.println(sb.toString());
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
