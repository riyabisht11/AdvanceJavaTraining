
package session;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionServlet2")
public class SessionServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
		      response.setContentType("text/html");
		      PrintWriter out = response.getWriter();
		      HttpSession session=request.getSession();
		      String u = (String)session.getAttribute("uname");
		      String p = (String)session.getAttribute("age");
		      out.print("Your Name is: "+u+" Your age is: "+p);
		      
		  }catch(Exception e)
		   {
		      System.out.println(e);
		   }	
	}

}
