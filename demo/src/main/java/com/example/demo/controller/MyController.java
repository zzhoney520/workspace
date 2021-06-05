package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@ConfigurationProperties(prefix = "com.honey.home")
@Data
public class MyController {
	public String id;
	public String firstName;
	public String lastName;
	public String company;
	public String job;
	public String email;
	public int age;

	@GetMapping("/getid")
	public String showID() {
		return this.getId();
	}

	@GetMapping("/getfirstname")
	public String showFirstName() {
		return String.format("%s", this.getFirstName());
	}

	@GetMapping("/getage")
	public int showAge() {
		return this.getAge();
	}

}
