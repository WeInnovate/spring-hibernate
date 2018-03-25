package com.atuldwivedi.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor()
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "EMP_NO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "AGE")
	private Integer age;

	@Column(name = "SALARY")
	private Double salary;

	public Employee(String name, String email, Integer age, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}
}
