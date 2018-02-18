package com.atuldwivedi.learn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atuldwivedi.learn.spring.domain.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "showStudentForm", method = RequestMethod.GET)
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping(value = "processStudentForm", method = RequestMethod.POST)
	public String processStudentForm(@ModelAttribute("student") Student std) {
		System.out.println(std);
		return "process-student-form";
	}
}
