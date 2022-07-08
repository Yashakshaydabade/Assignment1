package springcore_assignment.Q12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest 
{
	public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();

        ApplicationContext ctx=new ClassPathXmlApplicationContext("Assignment12.xml");

        Employee obj=(Employee) ctx.getBean("ibean12");
        Employee obj1=(Employee) ctx.getBean("ibean121");

        list.add(obj);
        list.add(obj1);

        Employee max=list.stream().max((s1 ,s2) ->s1.salary >s2.salary ? 1:-1).get();
        System.out.println("Maximum Salary in Department :"+max);
        System.out.println("Name of Employee having Highest Salary :"+max.ename);

        Double average=list.stream().collect(Collectors.averagingDouble(e ->e.salary));
        List <Employee> minavg=list.stream().filter(m ->m.salary<average).collect(Collectors.toList());

        System.out.println("\nEmployee Having Salary Less Than or Equal to Average Salary");
        for(Employee e:minavg) {
            System.out.println(e.ename+ " "+e.salary);    
        }
        List<String> department1=list.stream().map(r ->r.department).distinct().collect(Collectors.toList());
        for (String dept:department1) {

            Double avg=list.stream().filter(a ->a.department.equals(dept)).collect(Collectors.averagingDouble(d ->d.salary));
            System.out.println("Average Salary in Each Department : \n Average Salary: "+average+ "Department: "+dept);
        }    
    }  
}
