package Assignment4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		List<Employee>slist=new ArrayList<Employee>();
		ApplicationContext obj=new ClassPathXmlApplicationContext("Assignment4.xml");
		Employee e1=(Employee) obj.getBean("que4");
		Employee e2=(Employee) obj.getBean("que4a");
		slist.add(e1);
		slist.add(e2);
		
		
		 List<Employee> sortedlist=slist.stream().sorted((s1,s2)->Double.compare(s1.salary, s2.salary)).toList();
			
			for(Employee w: sortedlist)
			{
				w.display();
			}
	}

}
