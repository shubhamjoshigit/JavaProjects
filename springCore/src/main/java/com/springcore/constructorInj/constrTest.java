package com.springcore.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constrTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/constructorInj/cnstrconfig.xml");
		Person p1 = (Person)ctx.getBean("person");
		System.out.println(p1);

	}

}
