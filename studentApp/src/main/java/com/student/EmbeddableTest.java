package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.model.Certificate;
import com.student.model.Student;

public class EmbeddableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student s1 = new Student();
		s1.setId(100);
		s1.setFirstName("Shubham");
		s1.setLastName("Joshi");
		s1.setEmail("Shubhamjoshi@gmail.com");
		
		Certificate c1 = new Certificate();
		c1.setCourse("Jave");
		c1.setDuration("50");
		s1.setCertificate(c1);
		
		
		Student s2 = new Student();
		s2.setId(101);
		s2.setFirstName("Sagar");
		s2.setLastName("Bhosale");
		s2.setEmail("Sagarbhosale@gmail.com");
		
		Certificate c2 = new Certificate();
		c2.setCourse("Javascript");
		c2.setDuration("20");
		s2.setCertificate(c2);
		
	    Transaction tx = session.beginTransaction();
	    session.save(s1);
	    session.save(s2);
	    tx.commit();
	    
	    session.close();
	    factory.close();

	}

}
