package Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign2Main {

	public static void main(String[] args) 
	{
		ApplicationContext objctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AssignAvg2 obj=(AssignAvg2) objctx.getBean("Assign2bean");
		obj.avrage();
				
	}
}