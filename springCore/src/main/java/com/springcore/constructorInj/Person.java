package com.springcore.constructorInj;

import java.util.List;
import java.util.Map;

public class Person {
	
	private String name;
	private int age;
	private Map<String,String> certi;
	private List<String> phones;
	public Person(String name, int age, Map<String, String> certi, List<String> phones) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", certi=" + certi + ", phones=" + phones + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
