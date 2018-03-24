package com.atuldwivedi.learn.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "ROLL_NO")
	private long rollNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "IS_GRADUATE")
	private boolean isGraduate;

	public long getRollNo() {
		return rollNo;
	}

	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", isGraduate=" + isGraduate + "]";
	}

	public Student(long rollNo, String name, boolean isGraduate) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.isGraduate = isGraduate;
	}
}
