

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/Welcome2")
public class Welcome2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body>");
		out.print("<h1>Welcome to my first servlet program<h1>");
		out.print("</body></html>");
		String uname=request.getParameter("uname");
		String password=request.getParameter("pwd");
		out.print("welcome to :"+uname);
		out.print("Your Password is:"+password);
		try {
			Class.forName("com.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet","root","root");
			Statement s=con.createStatement();
			boolean b=s.execute("insert into login values(uname,pwd)");
			if(b) {
				out.print("Record inserted successfully!! at browser");
				System.out.println("Record inserted successfully at console!!");
			}
		}
		catch(Exception e) {
			
		}
	}

}
