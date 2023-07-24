package com.springjdbc.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.springjdbc.dao"})
public class JdbcConfig {
	
	@Bean(name= {"ds"})
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
        return dataSource;		
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
//	@Bean(name= {"studentDaoImpl"})
//	public StudentDao getStudentDaoImpl() {
//		StudentDaoImpl studentdao = new StudentDaoImpl();
//		studentdao.setJdbcTemplate(getTemplate());
//		return studentdao;
//	}

}
