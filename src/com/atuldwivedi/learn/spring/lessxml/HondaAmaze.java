package com.atuldwivedi.learn.spring.lessxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hondaAm")
public class HondaAmaze implements Car {

	@Value("${hondaAmze.modelNumber}")
	private long modelNumber;

	@Value("${hondaAmze.color}")
	private String color;

	@Value("${hondaAmze.mileAge}")
	private double mileAge;

	@Value("${hondaAmze.maxSpeed}")
	private int maxSpeed;
	
	@Override
	public void driveTheCar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Driving ")
		.append(color)
		.append(" ")
		.append(this.getClass().getSimpleName())
		.append(" at speed of ")
		.append(maxSpeed)
		.append(" KMpH which has model number ")
		.append(modelNumber).append(" and mileage of ")
		.append(mileAge)
		.append(" KMpL");

		System.out.println(sb.toString());

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

}
