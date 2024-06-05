import java.util.*;
class perfect{
	perfect(int a[],int n,int i){
		int j,sum=0;
			for(j=1;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==a[i])
			System.out.print(sum+" ");		
	}
}
class demo{
	public static void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		System.out.println("Enter Limit=");
		int n=sc.nextInt();
		System.out.println("Enter n Numbers=");		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("\nPerfect Numbers=");
		for(int i=0;i<n;i++)
		{
			perfect ob=new perfect(a,n,i);
		}
	}
}
