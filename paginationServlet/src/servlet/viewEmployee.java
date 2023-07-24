package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empDao;
import pojo.Employee;

@WebServlet("/viewEmployee")
public class viewEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()) {
			String spageid = request.getParameter("page");
			int pageid = Integer.parseInt(request.getParameter("page"));
			int total=5;
			  if(pageid==1){}  
		        else{  
		            pageid = pageid-1;  
		            pageid = pageid*total+1;  
		        }  
			List<Employee> emp = empDao.getRecords(pageid, total);
			pw.print("<h1>Page No: "+spageid+"</h1>");  
	        pw.print("<table border='1' cellpadding='4' width='60%'>");  
	        pw.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
	        for(Employee e:emp){  
	            pw.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");  
	        }  
	        pw.print("</table>");  
	          
	        pw.print("<a href='viewEmployee?page=1'>1</a> ");  
	        pw.print("<a href='viewEmployee?page=2'>2</a> ");  
	        pw.print("<a href='viewEmployee?page=3'>3</a> ");  
	          
	        pw.close();  
			
		} catch (Exception e) {
			e.printStackTrace();
		}	}

}
