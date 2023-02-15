package secondservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/WelcomeBack")
public class WelcomeBack extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body>");
		out.print("<h1>Welcome from my first servelet program</h1>");
		out.print("</body></html>");
		String uname =request.getParameter("uname");
		String password=request.getParameter("pwd");
		out.print("welcome to :"+uname);
		out.print("Your Password is :"+password);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/servlet";
		Connection con=DriverManager.getConnection(url,"root","root");
		PreparedStatement ps=con.prepareStatement("insert into login1 values(?,?)");
		ps.setString(1,uname);
		ps.setString(2,password);
		
		ps.executeUpdate();
		ps.close();
		con.close();
		}
		catch(Exception e) {}{}		
	}
}
