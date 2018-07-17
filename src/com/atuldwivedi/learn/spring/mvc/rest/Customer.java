package com.atuldwivedi.learn.spring.mvc.rest;

public class Customer {

	private String firstName;

	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
