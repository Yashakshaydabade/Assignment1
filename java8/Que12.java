package Assignments;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;

//WAP to find maxium of 5 no , pass array to lambda expression , and return the maximum
//using lambda expression. dont use nested if else.

public class Que12 {

		interface maxmimunno
		{
			void array(int a[]);
		}
		public static void main(String[] args)
		{
			List<Integer> l=new ArrayList<Integer>();
			maxmimunno mn=(int a[])->
			{
				for(int i=1;i<a.length;i++)
				{
					l.add(a[i]);
				}
				Integer m=l.stream().max((e1,e2)->e1>e2?1:-1).get();
				System.out.println("Maximum no ="+m);
			};
			mn.array(new int[] {20,60,76,54,30});
			
		}

}
