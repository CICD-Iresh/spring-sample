package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Hellooo");
		return "Greetings from Spring Boot!";
	}
	
	public void sayHello() {
		System.out.println("Say hello");
	}

}
