package Assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest 
{
	
	    public static void main(String[] args) {

	        ApplicationContext context = new ClassPathXmlApplicationContext("Assignment10.xml");

	        Student student = (Student) context.getBean("ibean10");

	        student.getStd();
	    }
	}

