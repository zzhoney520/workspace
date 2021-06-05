package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	public Student GetStudent() {
		return new Student("honeysue345353666666", 36);
	}
}
