class Even{
	public static void main(String ab[])
	{
		int i;
		for(i=0;i<ab.length;i++)
		{
			int n=Integer.parseInt(ab[i]);
			if(n%2==0)
			System.out.print(n+" ");
		}
	}
}
