package Assignment15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objctx=new ClassPathXmlApplicationContext("Assignment15.xml");
		Customer custobj=(Customer) objctx.getBean("custbean");
		custobj.show();
	}

}
