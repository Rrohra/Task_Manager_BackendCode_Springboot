package com.in28minutes.rest.webservices.restfulwebservices.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.beans.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AuthenticationController {
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean authenticationbean() {
		return new AuthenticationBean("you are authenticated");
	}

}
