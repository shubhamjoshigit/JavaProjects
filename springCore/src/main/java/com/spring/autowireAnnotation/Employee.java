package com.spring.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private String empName;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Employee(Address address) {
		super();
		
		this.address = address;
		System.out.println("ctr injection");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
	

}
