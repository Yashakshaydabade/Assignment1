package TddAssign;

import java.util.Scanner;

public class Que6 {

//public static vowel()
//{
	
	public static int vowel()
	{

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		//int count1=0;
		for(int i=0;i<s.length();i++)
	{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'  || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
			else if(s.charAt(i)=='A' || s.charAt(i)=='E'  || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				count++;
			}
	}
		
		return count;
		
	}
	}

