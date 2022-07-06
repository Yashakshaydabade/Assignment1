package Assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignvowel6 {

	public static void main(String[] args) 
	{
		ApplicationContext objctx6=new ClassPathXmlApplicationContext("applicationContext.xml");
		Assign6 obj6=(Assign6) objctx6.getBean("vowel6");
		obj6.Vowel();
	}
}
