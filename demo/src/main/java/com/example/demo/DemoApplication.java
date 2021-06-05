package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
@lombok.Getter
@lombok.Setter
public class DemoApplication {

	@Autowired
	public Student honey;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name") String name) {

		return String.format("Hello %s!", name);
	}

	@GetMapping("/welcome")
	public String welcome(@RequestParam(value = "welcome", defaultValue = "honey") String name) {
		return String.format("welcome %s!", honey.GetName_from_properties());
	}

}
