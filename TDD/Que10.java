package TddAssign;

import java.util.Scanner;

public class Que10 {

	public static String concat_String()
	{
		String[] fruits= {"apple","kiwi","graphes","mango","watermelon"};
		String s="";
		for (int i = 0; i < fruits.length; i++)
		{
			if(i==fruits.length-1)
			{
				s=s+fruits[i];
			}
			else
			{
				s=s+fruits[i]+"-";
			}
		}
		return s;
	}
	public static void main(String[] args) 
	{
		System.out.println(Que10.concat_String());
	}


}
