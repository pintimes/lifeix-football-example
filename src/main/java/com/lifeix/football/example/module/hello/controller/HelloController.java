package com.lifeix.football.example.module.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String list() {
		return "111";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String add() {
		return "2222";
	}
}
