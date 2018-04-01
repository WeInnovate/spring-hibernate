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
@Table(name = "EMPLOYEE_AUTO")
public class EmployeeAuto {

	@Id
	@Column(name = "ROLL_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "AGE")
	private Integer age;

	@Column(name = "SALARY")
	private Double salary;

	public EmployeeAuto(String name, String email, Integer age, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}
}
