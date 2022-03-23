package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//
@SpringBootApplication
public class SpringOpenshiftApplication {

	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to Ravi adda";
	}
	
	@GetMapping("/{input}")
	public String welcome1(@PathVariable String input) {
		
		return "Hi"+ input +"Welcome to Ravi adda";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}

}
