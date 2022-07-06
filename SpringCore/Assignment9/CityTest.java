package Assignment9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityTest {

			public static void main(String[] args)
			{
				ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		        City cobj1 = (City) objctx.getBean("cbean1");
		        City cobj2 = (City) objctx.getBean("cbean2");
		        cobj1.show();
		        cobj2.show();
			}
	}

