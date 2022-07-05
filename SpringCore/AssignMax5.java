package Assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignMax5 {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Assign5 abj1=(Assign5) ac.getBean("assign5bean");
		abj1.maximum();
	}
	
	
}
