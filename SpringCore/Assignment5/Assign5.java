package Assignment5;

import java.util.List;

public class Assign5 {

	List<Integer> number;

	public Assign5(List<Integer> number)
	{
		super();
		this.number = number;
	}
	
	void maximum()
	{
		Integer obj=number.stream().max((s1,s2)->s1>s2?1:-1).get();
		
		System.out.println(obj);
	}
	
}
