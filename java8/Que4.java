package Assignments;
import java.util.Arrays;
import java.util.List;


//WAP to find maximum from array of numbers with the help of stream api.

public class Que4 
{
	public static void main(String[] args) 
	{
		Integer arr[]= {10,29,39,18,54,48,63,95};
		List<Integer> l=Arrays.asList(arr);
		Integer maximum=l.stream().max(Integer::compare).get();
		System.out.println(maximum);
	}
}
