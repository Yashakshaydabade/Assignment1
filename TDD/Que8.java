package TddAssign;

public class Que8 {

	public static boolean EvenOdd()
	{
		int[] a= {2,4,6,8,10};
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
				return true;
		}
		return false; 
	}
	public static void main(String[] args) 
	{
		System.out.println(Que8.EvenOdd());
	}
}
