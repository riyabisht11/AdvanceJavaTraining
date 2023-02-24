package ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCI {
	 public static void main( String[] args )
	    {
	       ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorInjection/CIconfig.xml");
	       Person p=(Person)context.getBean("objPerson",Person.class);
	       System.out.print(p);
	       
	    }

}
