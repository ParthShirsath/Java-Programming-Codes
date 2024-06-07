import java.util.*;
class demo{
	public static void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		int b[]=new int[100];
		System.out.println("Enter Limit=");
		int n=sc.nextInt();
		System.out.println("Enter n Numbers=");		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\nPerfect Numbers=");
		int j,sum=0;
		for(int i=0;i<n;i++)
		{
		sum=0;
			for(j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==a[i])
			{
				b[i]=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(b[i]!=0)
			System.out.println(b[i]);
		}
	}
}
