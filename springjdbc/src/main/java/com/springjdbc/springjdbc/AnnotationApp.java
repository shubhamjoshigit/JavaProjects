package com.springjdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.pojo.JdbcConfig;
import com.springjdbc.pojo.Student;

public class AnnotationApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentdao = ctx.getBean("studentDaoImpl",StudentDao.class);
		List<Student> students = studentdao.getAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}

	}

}
