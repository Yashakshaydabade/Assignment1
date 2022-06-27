package Assignments;

//Consider a scene we are having following series, 1,2,3,6,7,8,10,11,12,13,14,17,18,19,20
//Now you need to print the output in following way
//1-3,6-8,10-14,17-20

public class Que13 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		int sta=0;
		int ed=0;
		int temp;
		for (int i = 0; i < a.length-1; i++)
		{
			if(i==0)
			{
				sta=a[0];
				for(int k=i;k<a.length-1;k++)
				{
					if(a[k+1]-1!=a[k])
					{
						ed=a[k];
						break;
					}
				}
				System.out.println(sta+" "+ed);
			}
			else if(a[i+1]-a[i]>=2)
			{
				sta=a[i+1];
				for(int k=i+1;k<a.length-1;k++)
				{
					if(a[k+1]-1!=a[k])
					{
						ed=a[k];
						break;
					}
					if(k==(a.length-2))
					{
						ed=a[a.length-1];
					}
				}
				System.out.println(sta+" "+ed);
			}
		}
}
}
