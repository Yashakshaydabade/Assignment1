package Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		

		ApplicationContext objctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		item obj=(item)objctx.getBean("obja");
		obj.show();
	}

}
