package Assignment7;

		public class Class1
		{
			int a[]=new int[5];
			Class2 obj2;
		
			public Class1(int[] a, Class2 obj2) {
				super();
				this.a = a;
				this.obj2 = obj2;
			}

			public void merge_array()
			{
				int c[]=new int[a.length + obj2.b.length];
				int cindex=0;
				for (int i = 0; i < c.length; i++)
				{
					if(i<a.length)         
						c[cindex++]=a[i];
					if(i<obj2.b.length)
						c[cindex++]=obj2.b[i];
				}
				int max=Integer.MIN_VALUE;
				for (int i = 0; i < c.length; i++)
				{
					if(max<c[i])
						max=c[i];
				}
				System.out.println("maximum value is :"+max);
			}
			
		}
		
