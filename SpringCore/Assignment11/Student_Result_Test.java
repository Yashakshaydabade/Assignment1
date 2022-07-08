package springcore_assignment.Q11;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Result_Test
{
    public static void main(String[] args) 
    {
        List<Student> list=new ArrayList<>();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Assignment11.xml");
        Student student1=(Student) ctx.getBean("student1");
         Student student2=(Student) ctx.getBean("student2");
        Student student3=(Student) ctx.getBean("student3");
        Student student4=(Student) ctx.getBean("student4");
        Student student5=(Student) ctx.getBean("student5");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        for (Student stu:list)
        {
            System.out.println(stu.studentname+ ": "+stu.obj.totalMarks);
        }

        List<Student> sortlist=list.stream().sorted((s1,s2) ->Float.compare(s1.obj.totalMarks, s2.obj.totalMarks)).collect(Collectors.toList());
        System.out.println("Sorted list of Students as per total Marks");

        for(Student stu:sortlist)
        {
            System.out.println(stu.studentname+ ": "+stu.obj.totalMarks);
        }


    }

}