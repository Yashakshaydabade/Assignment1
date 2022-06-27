package Assignments;
import java.util.stream.IntStream;

//wap to perform parrallel stream api to find the no.


public class Que11 
{
	public static void main(String[] args) 
	{
		System.out.println("Normal ===");
		
		IntStream r1 =IntStream.rangeClosed(1, 10);
		r1.forEach(System.out::println);
		System.out.println("parallel Stream==");
		
		IntStream r2=IntStream.rangeClosed(1, 10);
		r2.parallel().forEach(System.out::println);
	}
}
