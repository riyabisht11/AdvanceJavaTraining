package generics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/ShowGenerics")
public class ShowGenerics extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int k = Integer.parseInt(request.getParameter("k"));
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>Entered in url is: " + k +"</h2>");
	}

}
