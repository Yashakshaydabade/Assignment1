package Assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem {

		public static void main(String[] args) 
		{
			ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			Item obj= (Item) objctx.getBean("itembean");
			obj.show();
			obj.decendingOrder();
			obj.removeduplicate();

		}
	}


