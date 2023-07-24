package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stereotypeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = ctx.getBean("student",Student.class);
		System.out.println(student);

	}

}
