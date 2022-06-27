package Assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//1. WAP to find out average marks from the list of the marks, user will enter the marks through
//the input box and you need to fetch them and calculate the marks



public class Que1 {
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 5 subject marks");
		List<Integer> ml=new ArrayList<>();
		for (int i = 0; i < 5; i++) 
			
		{
			ml.add(sc.nextInt());
		}
		
		System.out.println(ml);
		Double avg=ml.stream().collect(Collectors.averagingInt(s1->s1));
		System.out.println("Average marks of student="+avg);
		
	}
		
}
