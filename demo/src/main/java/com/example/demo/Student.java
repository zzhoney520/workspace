package com.example.demo;

public class Student {
	private String name;
	private int age;

	private String name_from_properties;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String GetName() {
		return this.name;
	}

	public String GetName_from_properties() {
		return this.name_from_properties;
	}
}
