package com.atuldwivedi.learn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String greetMe() {
//		int i = 10/0;
		return "index";
	}
	
}
