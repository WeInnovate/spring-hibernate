package com.atuldwivedi.learn.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetController {
	

	
	@RequestMapping(value="/greetForm", method=RequestMethod.GET )
	public String greetForm() {
		return "greet-form";
	}
	
	
	@RequestMapping(value="/processGreetForm",  method=RequestMethod.POST)
	public String processGreetForm(HttpServletRequest request, Model model) {
		String name = request.getParameter("nm");
		model.addAttribute("myName", name);
		return "process-greet-form";
	}

	@RequestMapping(value="/processGreetFormV2/{nm}/{cdnlk}",  method=RequestMethod.GET)
	public String processGreetFormV2(@PathVariable("nm") String name,  Model model) {
		model.addAttribute("myName", name);
		return "process-greet-form";
	}
}
