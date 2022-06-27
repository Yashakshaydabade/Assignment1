package Assignments;

import java.util.ArrayList;
import java.util.List;

//WAP to find the maximum length of given string without using any length function use
//stream api. 
public class Que5 {

public static void main(String[] args) 	
{
	String [] strr= {"Ajay","Nikhil","Ram","shubham","Ravi"};
	List<Integer> count=new ArrayList<>();
	for(String s1:strr)
	{
		int counter=0;
		char[] arr=s1.toCharArray();
		for(char ch:arr)
		{
			counter++;
		}
		count.add(counter);
	}
	Integer max=count.stream().max((a,b)->a>b?1:-1).get();
	System.out.println(max);
}
}
