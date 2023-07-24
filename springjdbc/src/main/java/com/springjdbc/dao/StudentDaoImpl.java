package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.pojo.Student;

@Component
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addStudent(Student student) {
		String query = "INSERT INTO student(id,name,city) VALUES(?,?,?)";
		int res = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}

	public int updateStudent(Student student) {
		String query = "UPDATE student SET name=?,city=? where id=?";
		int res = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}

	public int deleteStudent(int id) {
		String query = "DELETE FROM STUDENT WHERE id=?";
		int res = this.jdbcTemplate.update(query,id);
		return res;
	}

	public Student getStudentById(int id) {
		String query = "SELECT * FROM STUDENT WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,id);
		return student;
	}

	public List<Student> getAllStudents() {
		String query = "SELECT * FROM STUDENT";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

}
