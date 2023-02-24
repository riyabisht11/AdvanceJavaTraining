package RefType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("RefType/RefConfig.xml");
       A a=(A)context.getBean("obj",A.class);
       System.out.print(a);
       
    }

}
