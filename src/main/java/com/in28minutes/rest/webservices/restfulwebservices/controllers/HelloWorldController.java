package com.in28minutes.rest.webservices.restfulwebservices.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.beans.HellowWorldBean;


@CrossOrigin(origins="http://localhost:4200") //* is not working
//this tells spring MVC , that his handles REST requests
@RestController 
public class HelloWorldController {
	
	@RequestMapping(method= RequestMethod.GET, path="/hello-world")
	public String helloworld() {
		return "Helo EWorld";
	}
	
	
	//here we will return some object-bean
	//hellow world bean
	@GetMapping(path="/hello-world-bean")
	public HellowWorldBean helloWorldbean() { //access modifier, return type -(class name) ,method name
		return new HellowWorldBean("hello");
		//throw new RuntimeException("Contct rohit");
	}

	@GetMapping(path="/hello-world/path-variable/{name}")  //yeh naam niche map hojaega
	public HellowWorldBean hellowWorldbeanpathvariable(@PathVariable String name) {
		return new HellowWorldBean(String.format("Hellow world, %s", name));
	}


	
}
