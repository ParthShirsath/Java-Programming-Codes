class Sort{
	void sort(int a[],int l)
	{
		int pass,i,t;
		for(pass=1;pass<l;pass++)
		{
			for(i=0;i<l-pass;i++)
			{
				if(a[i]<a[i+1])
				{
					t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
			}
		}
	}
	void disp(int a[],int l)
	{
		int i;
		for(i=0;i<l;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String ab[])
	{
		int i;
		int a[]=new int[20];
		int l=ab.length;
		Sort ob=new Sort();
		for(i=0;i<l;i++)
			{
				a[i]=Integer.parseInt(ab[i]);
			}
		ob.sort(a,l);
		ob.disp(a,l);
	}
}
