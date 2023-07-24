package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Employee e1 = (Employee)ctx.getBean("emp1");
		System.out.println(e1.getEmpName());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getPhones());
		System.out.println(e1.getCourses());
        

	}

}
