package com.sapient.pkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

	
	
	@GetMapping("/{greet}")
	public Greeting fun(@PathVariable(name = "greet") String greet)
	{
		return new Greeting(greet+"-"+"hey");
	}
	
}
