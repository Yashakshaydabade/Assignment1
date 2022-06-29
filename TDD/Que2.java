package TddAssign;

import java.util.Scanner;

public class Que2 {


	public static boolean palindrome2()
	{
		String s1="dcba";
		String s2="abcd";
		String s3="";
		for (int i =s1.length()-1 ; i >=0; i--)
		{
			s3=s3+s1.charAt(i);
		}
		if(s1.equals(s3))
		{
			return true;
		}
		return false;
	}
	
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int temp=a;
//		int data=0;
//		int res=0;
//		while(temp>0)
//		{
//			data=temp%10;
//			res=res*10+data;
//			temp/=10;
//		}
//		if(a==res)
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//	}
}
