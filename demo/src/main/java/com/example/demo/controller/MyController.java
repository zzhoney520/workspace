package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

@RestController
@ConfigurationProperties(prefix = "com.honey.home")
@Data
@Log4j2
public class MyController {
	public String id;
	public String firstName;
	public String lastName;
	public String company;
	public String job;
	public String email;
	public int age;

	@GetMapping("/getid")
	public String showID(@Value("${random.int.5,100;}") String strID) {
		return strID;
	}

	@GetMapping("/getfirstname")
	public String showFirstName(@Value("${com.honey.home.firstname}") String firstName) {
		return String.format("%s", firstName);
	}

	@GetMapping("/getage")
	public int showAge() {
		return this.getAge();
	}
		
	
}
