package com.csec20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/csec20/Setter_config.xml");
       Student s=(Student)context.getBean("objStudent",Student.class);
       System.out.print(s);
       
    }
}
