package page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public void init(ServletConfig config) throws ServletException {
	
	}


	public void destroy() {
	
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter pw = response.getWriter()) {
			response.setContentType("text/html");
		    String n = request.getParameter("uname");
		    pw.print("<h3>Hello from servlet2: "+n+"</h3>");
		    pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
