package com.softech.Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class New {
	
	@RequestMapping(value="/all")
	public String getAll() {
		return "my name is santosh rana";
	}
	
	
	

}
