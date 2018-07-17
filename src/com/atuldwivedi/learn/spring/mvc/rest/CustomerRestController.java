package com.atuldwivedi.learn.spring.mvc.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest/v1.0/customers")
public class CustomerRestController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Customer getCutomer() {
		return new Customer("Atul", "Dwivedi");
	}
}
