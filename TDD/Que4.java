package TddAssign;


public class Que4 {
	
	public static String armstrong() 
	{
	
	        int num=153;
	        int temp=num;
	        int r,sum=0;
	        
	        while(num>0)
	        {
	        	r=num%10;
	        	num=num/10;
	        	sum=sum+r*r*r;
	        }
	        if(temp==sum)
	        	return("Armstrong no");
	        else
	        	return("Not Armstorg no");
	}
	        
//	   public static void main(String[] args) 
//	   {
//		   Que4 obj=new Que4();
//		   System.out.println(obj.armstrong());
//	}

}
