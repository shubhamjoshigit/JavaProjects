package com.springcore.ref;

public class A {
	
	private int a;
	private B ob;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", ob=" + ob + "]";
	}
	
	

}
