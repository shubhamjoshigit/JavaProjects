package page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/urlrewriting"},loadOnStartup=1)
public class urlrewriting extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try(PrintWriter pw = response.getWriter()) {
		response.setContentType("text/html");
		String n = request.getParameter("userName");
		pw.print("<h2>Hello "+n+"</h2><br>");
		pw.print("<a href='servlet2?uname="+n+"'>visit</a>");
		pw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
