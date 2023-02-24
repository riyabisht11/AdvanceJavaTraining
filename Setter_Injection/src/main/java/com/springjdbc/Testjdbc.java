package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Testjdbc {
	public static void main(String[] arg) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/ConfigJdbc.xml");
		JdbcTemplate template=(JdbcTemplate)context.getBean("jdbcTemp",JdbcTemplate.class);
		//Create table
		//String createQ="create table student1 (id int primary key,name varchar(40),city varchar(40))";
		//template.execute(createQ);
		//System.out.print("Table is created !!!");
		
		// insert a a record into Student1 table
		//String insQ="insert into Student1(id,name,city) values(?,?,?)";
		//int i=template.update(insQ,03,"Vivek","New Delhi");
		//int i=template.update(insQ,07,"Raju","Bombay");
		//int i=template.update(insQ,19,"Daksh","kolkata");
		//System.out.print(i+"Record Inserted!!!");
		
		//update record in a table
		//String updQ="update Student1 set city=? where id=?";
		//int i=template.update(updQ,"Rohtak",3);
		//System.out.print(i+"Record updated!!!");
		
		//delete a record from Student table
		String delQ="delete from Student1 where id=?";
		template.update(delQ,3);
		System.out.print("Record deleted");
		
		
	}

}
