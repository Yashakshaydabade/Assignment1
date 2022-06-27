package Assignments;

//User will input the “ABCD” now you need to print how many permutation is created like
//BACD, CBAD, and many others.


public class Que14 
{
	public static void main(String[] args) 
	{
		String str="ABCD";
		int n=str.length();
		
		Que14 obj=new Que14();
		obj.permute(str,0,n-1);
	}
	
	private void permute(String str,int s,int e)
	{
		if(s==e)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=s;i<=e;i++)
			{
				str=swapping(str,s,i);
				permute(str,s+1,e);
				str=swapping(str,s,i);
			}
		}
	}

	private String swapping(String s, int i, int j) 
	{
	char temp;
	char[] ch=s.toCharArray();
	
	temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	
	return String.valueOf(ch);
		
	}
}
