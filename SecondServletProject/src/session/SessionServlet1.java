package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet1
 */
@WebServlet("/SessionServlet1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try{
		      response.setContentType("text/html");
		      PrintWriter out = response.getWriter();

		      String name = request.getParameter("user");
		      String age = request.getParameter("age");
		      out.print("Hello "+ name);
		      out.print("Your age is: "+ age);
		      HttpSession session=request.getSession();
		      session.setAttribute("uname",name);
		      session.setAttribute("age",age);
		      out.print("<a href='SessionServlet2'>view details</a>");
		     
		    }catch(Exception e)
		     {
		       System.out.println(e);
		     }
	}

}
