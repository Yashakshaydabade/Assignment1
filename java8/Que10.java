package Assignments;


//WAP to create 10 objects of employee class, add all object to arraylist and from arraylist we
//need to convert this to map and set using stream api.


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.swing.border.EmptyBorder;

public class Que10 {

	private String name;
	private int age;
	private float salary;
	public Que10(String name, int age, int i) {
		super();
		this.name = name;
		this.age = age;
		this.salary = i;
	}

	public static void main(String[] args) 
	{
		List<Que10> em=new ArrayList<>();
		em.add(new Que10("Ajit", 20, 20000));
		em.add(new Que10("Ajay", 25, 20000));
		em.add(new Que10("Amar", 18, 20000));
		em.add(new Que10("Ajinkya", 24, 20000));
		em.add(new Que10("Swapnil", 22, 20000));
		em.add(new Que10("Raj", 26, 20000));
		
		Map<Integer, String> emp=em.stream().collect(Collectors.toMap(a->a.age, a->a.name));
		System.out.println(emp);
		
		System.out.println();
		Set<String> lset=em.stream().map(a->a.name).collect(Collectors.toSet());
		System.out.println("Employee Name="+lset);
		
		
		
		
		
		
		
	
	}
}
