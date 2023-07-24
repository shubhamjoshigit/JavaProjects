package com.spring.autowire;

public class Employee {
	
	private String empName;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, Address address) {
		super();
		this.empName = empName;
		this.address = address;
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
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
	

}
