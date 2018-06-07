package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Springboot2App {
	
	@RequestMapping("/")
	public String hello() {
		return "Welcom to start spring boot!";
	}
}