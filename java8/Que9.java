package Assignments;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//WAP to implement predicate to check given list of array contain how many even and odd
//nos.

public class Que9 {

public static void main(String[] args) {
		
		IntPredicate isodd=argument->argument%2==1;
		System.out.println("Enter values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(isodd.test(a));
		
	IntStream stream=IntStream.range(1, 10);
		
	 	List<Integer> oddnum=stream.filter(isodd).boxed().collect(Collectors.toList());
	    System.out.println(oddnum);
		
		IntPredicate iseven=argument->argument%2==0;
		System.out.println(iseven.test(a));
		
		IntStream stream2=IntStream.range(1, 10);
		List<Integer> evenNumbers=stream2.filter(iseven).boxed().collect(Collectors.toList());
		
		System.out.println(evenNumbers);
	}
}
