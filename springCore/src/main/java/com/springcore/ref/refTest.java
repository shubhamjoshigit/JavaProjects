package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a1 = (A)ctx.getBean("a1");
		B b1 = (B)ctx.getBean("b1");
		
		System.out.println(a1);
		System.out.println(a1.getA());
		System.out.println(b1.getB());
		System.out.println(a1.getOb());

	}

}
