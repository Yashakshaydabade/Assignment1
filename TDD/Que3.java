package TddAssign;

import java.util.Scanner;

public class Que3 {

	public static boolean PassEmail()
	{
		String email="akshay.dabade@yash.com";
		String pass="Pass@123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email and password");
		String e=sc.next();
		String p=sc.next();
		if(email.equals(e) && pass.equals(p))
		{
			return true;
		}
		return false;
	}
}
