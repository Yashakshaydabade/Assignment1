package Assignment3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assign3Test {

	public static void main(String[] args) 
	{
		ApplicationContext obj=new ClassPathXmlApplicationContext("applicationContext.xml");
		AssignEMI3 objemi=(AssignEMI3) obj.getBean("emibean");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter loan Amt=");
		objemi.setLoanamt(sc.nextInt());
		System.out.println("Enter no of years=");
		objemi.setYears(sc.nextInt());
		
		objemi.emicalc();
		
		
	}

}
