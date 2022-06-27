package Assignments;

import java.util.Scanner;
import java.util.function.Predicate;

// WAP to implement predicate to check given no is even or not


public class Que8 {
	
	public static boolean eo(int num)
	{
		Predicate<Integer> even=a->(a%2==0);
		return even.test(num);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num");
	int sum=sc.nextInt();
	
	if(Que8.eo(sum)==true)
	{
		System.out.println("Even num");
	}
	else
	{
		System.out.println("Not Even num");
	}
}
}
