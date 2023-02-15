package databaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;

public class TableCreation {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			Statement stmt = c.createStatement();
			stmt.executeUpdate("create table Student1(roll int, name varchar(35))");
			stm.setInt(1, 101);
			stm.setString(2,"Riya");
			System.out.println("Table Created..");
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}
}
