package Cookies;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/CookieServlet1")
public class CookieServlet1 extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response){
	try{

	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		
	String n=request.getParameter("uname");
	out.print("Welcome "+n);

	Cookie ck=new Cookie("First",n);//creating cookie object
       	response.addCookie(ck);//adding cookie in the response

	//creating submit button
	out.print("<form action='CookieServlet2' method='post'>");
	out.print("<input type='submit' value='Go'>");
	out.print("</form>");
		
	out.close();

        }catch(Exception e){}
  }
}
