package Assignments;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


// WAP to print distinct marks from the list of given marks
public class Que2 
{
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,5,7,8,5,3,3,6,4);
		List<Integer> sortedl=l.stream().sorted().distinct().collect(Collectors.toList());
		
		System.out.println(l);
		System.out.println(sortedl);
	}
}

