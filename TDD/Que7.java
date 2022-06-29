package TddAssign;

public class Que7 {

	public static String palindrome()
	{
		 int r,sum=0,temp;    
		 int n=454;
		  temp=n;    
		  while(n>0)
		  {
			  r=n%10;
			  sum=(sum*10)+r;    
			   n=n/10;
		  }
		  if(temp==sum)    
			   return("palindrome number");    
			  else    
			  return("not palindrome");    
	}
//	public static void main(String[] args) 
//	{
//		Que7 obj=new Que7();
//		System.out.println(Que7.palindrome());
//	}
}
