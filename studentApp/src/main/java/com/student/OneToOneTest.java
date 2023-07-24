package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.model.Answer;
import com.student.model.Question;

public class OneToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Question q1 = new Question(100, "What is your name?");
		Answer a1 = new Answer(1000, "Shubham Joshi");
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		
		Question q2 = new Question(101, "What is your lastname?");
		Answer a2 = new Answer(1001, "Joshi");
		q2.setAnswer(a2);
		a2.setQuestion(q2);
		
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(a1);
		session.save(q2);
		session.save(a2);
		
	    tx.commit();
	    
	    //fetching
	    Question q = (Question)session.get(Question.class, 100);
	    System.out.println(q.getQuestion());
	    System.out.println(q.getAnswer().getAnswer());
		session.close();
		factory.close();
		
		

	}

}
