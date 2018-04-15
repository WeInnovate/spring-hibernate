package com.atuldwivedi.learn.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atuldwivedi.learn.spring.domain.Student;
import com.atuldwivedi.learn.spring.mvc.dao.StudentDao;
import com.atuldwivedi.learn.spring.mvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@InitBinder
	public void anyMethod(WebDataBinder webDataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, ste);
	}

	@RequestMapping(value = "showStudentForm", method = RequestMethod.GET)
	public String showStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping(value = "processStudentForm", method = RequestMethod.POST)
	public String processStudentForm(@Valid @ModelAttribute("student") Student std, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {
			System.out.println(std);
			studentService.saveStudent(std);
			return "process-student-form";
		}

	}
}
