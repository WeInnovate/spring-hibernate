package com.atuldwivedi.learn.spring.domain;

import javax.validation.constraints.NotNull;

public class Student {
	
	@NotNull(message=" is required")
	private String firstName;
	
	private String lastName = "Dwivedi";
	
	private String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
	}
	
	

}
