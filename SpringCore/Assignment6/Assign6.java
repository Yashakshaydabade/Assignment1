package Assignment6;

import java.util.List;

public class Assign6 {

	String ar[]=new String[10];
	
		void Vowel()
		{
			for (int i = 0; i < ar.length; i++)
			{
				String s=ar[i];
				int count=0;
				char ch[]=s.toCharArray();
				for (int j = 0; j < ch.length; j++) 
				{
					if(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u')
					{
					count++;	
					}
				}
				if(count==ch.length)
				{
					String s1= new String(ch);
					System.out.println(s1);
				}
			}
		}

		public Assign6(String[] ar) {
			super();
			this.ar = ar;
		}
	
}
