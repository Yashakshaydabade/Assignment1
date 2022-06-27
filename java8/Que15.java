package Assignments;

public class Que15 {
	
//From a given set of numbers in array, you need to find out how many number satisfy the
//Pythagoras template
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,5,10,8,6,9};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j = i+1; j < a.length-1; j++)
			{
				for (int k = j+1; k < a.length; k++) 
				{
					if(a[i]*a[i]==(a[j]*a[j]+a[k]*a[k]) || a[j]*a[j]==(a[i]*a[i]+a[k]*a[k]) || a[k]*a[k]==(a[i]*a[i]+a[j]*a[j]));
					{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					cnt++;
					}
				}
			}
		}
		System.out.println("Pythagorus Triplets are="+cnt);
		
	}

}
