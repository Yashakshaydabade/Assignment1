package Assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//WAP to take name of employee, sort all employee name using stream and print only unique
//name from it.

public class Que3 {
public static void main(String[] args) 
{
	List<String> emp=Arrays.asList("Ajay","Ajay","Akash","vijay","Ravindra","Nitin","Nitin");
	
	List<String> slist=emp.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
	System.out.println(slist);
}
}
