package com.atuldwivedi.learn.spring.domain;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.atuldwivedi.learn.custann.BatchPrefix;

import lombok.Data;

@Data
public class Student {
	
	@NotNull(message=" is required")
	private String firstName;
	
	@Size(min=4, max=8, message=" shold be between 4 and 8")
	private String lastName = "Dwivedi";
	
	@NotNull(message=" is required")
	private String gender;
	
	@Min(value=18, message=" age should not be < 18")
	@Max(value=60, message=" age should not be > 60")
	private Integer age;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past
	private Date dob;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{6}")
	private String email;

	@BatchPrefix(value="FW", message="wrong")
	private String batchId;
}
