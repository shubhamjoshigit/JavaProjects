package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecycleTest {

	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Book b1 = (Book)ctx.getBean("book");
		ctx.registerShutdownHook();
		System.out.println(b1);

	}

}
