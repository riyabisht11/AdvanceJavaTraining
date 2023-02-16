package calculator;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Calculator2")
public class Calculator2 extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); // informing the client that which format of data/response will be send
		PrintWriter out= response.getWriter(); 
		
				int a1= Integer.parseInt(request.getParameter("n1")); 
				int a2= Integer.parseInt(request.getParameter("n2")); 
		
		if (request.getParameter("r1")!=null) 
		{
			out.println("<h3> Addition= </h3>"+(a1+a2));
		}
		else if(request.getParameter("r2")!=null) 
		{
			out.println("<h3> Subtraction= </h3>"+(a1-a2));
		}
		else if(request.getParameter("r3")!=null) 
		{
			out.println("<h3> Multiply= </h3>"+(a1*a2));
		}
		else
		{
			out.println("<h3> Divide= </h3>"+(a1/a2));
		}		
	}
}