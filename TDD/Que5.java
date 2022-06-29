package TddAssign;

import java.util.Scanner;

public class Que5 {

	public static boolean pythagoras()
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[3];
		System.out.println("Enter 3 num");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				for (int k = j+1; k < a.length; k++)
				{
					if(a[i]*a[i]==a[j]*a[j]+a[k]*a[k] || a[j]*a[j]==a[i]*a[i]+a[k]*a[k] || a[k]*a[k]==a[i]*a[i]+a[j]*a[j])
					{
						 return true;
						
					}
				}
			}
		}
		return false;
	}
}
