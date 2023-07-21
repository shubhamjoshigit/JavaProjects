package Page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hi2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In init :"+getClass().getName());
	}

	public void destroy() {
		System.out.println("In Destroy :"+getClass().getName());
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try(PrintWriter pw = response.getWriter()) {
		response.setContentType("text/html");
		System.out.println("In service : "+getClass().getName());
		pw.write("<h3>Wecome here"+getClass().getName()+"</h3>");
		pw.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
