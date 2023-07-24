package com.spring.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/autowireAnnotation/autowireconfig.xml");
		Employee emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		System.out.println(emp.getAddress());
	}

}
