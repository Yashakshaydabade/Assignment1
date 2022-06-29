package TddAssign;

import java.util.Scanner;

public class Que9 {

	public static boolean remove()
	//int [] num= {1,2,3,4,5,6,7,8,9};
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num");
	int num=sc.nextInt();

	if(num%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
