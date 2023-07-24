package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.pojo.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int id);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();

}
