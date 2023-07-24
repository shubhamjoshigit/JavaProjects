package com.springcore.lifecycle;

public class Book {
	
	private String name;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Book");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Init method call");
	}
	
	public void destroy() {
		System.out.println("Destroy method call");
	}
	

}
