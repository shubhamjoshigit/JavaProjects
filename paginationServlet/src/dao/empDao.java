package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pojo.Employee;

public class empDao {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","12345");  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
   public static List<Employee> getRecords(int start, int total){
	   
	   List<Employee> list = new ArrayList<Employee>();
	   
	   try {
		   Connection con = getConnection();
		   PreparedStatement ps = con.prepareStatement("select * from employee limit "+(start-1)+","+total);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			   Employee e = new Employee();
			   e.setId(rs.getInt(1));
			   e.setName(rs.getString(2));
			   e.setSalary(rs.getFloat(3));
			   list.add(e);
		   }
		   con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return list;
		
	}

}
