import java.util.*;
interface number{
	void reverse(int num);
	void factorial(int num);
	void sum_of_digit(int num);
	void prime(int n);
	void perfect(int n);
}
interface area{
	void circle(float r);
	void spehere(float r);
	void triangle(float h,float b);
	void rect(float l,float b);
	void cylinder(float r,float h);
	final float pi=3.14f;
}
class check implements number,area{
	public void sum_of_digit(int num){
		int d,i,s=0;
		while(num>0)
		{
			d=num%10;
			s=s+d;
			num=num/10;
		}
		System.out.println("Sum of digits of number="+s);
	}
	public void reverse(int num){
		int d,i,s=0;
		while(num>0)
		{
			d=num%10;
			s=(s*10)+d;
			num=num/10;
		}
		System.out.println("Reverse of number="+s);
	}
	public void factorial(int num)
	{
		int i,sum=1;
		for(i=1;i<=num;i++)
		{
			sum=sum*i;
		}
		System.out.println("Factorial of number="+sum);
	}
	public void prime(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		System.out.println("Number is prime.....");
		else
		System.out.println("Number is not prime.....");
	}
	public void perfect(int n)
	{
	int i,s=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s=s+i;
			}
		}
		if(s==n)
		System.out.println("Number is perfect.....");
		else
		System.out.println("Number is not perfect.....");
	}
	public void circle(float r)
	{
		System.out.println("Area of circle="+(pi*r*r));
	}
	
	public void spehere(float r)
	{
		System.out.println("Area of Spehere="+(4*pi*r*r));
	}
	public void triangle(float h,float b)
	{
		System.out.println("Area of Triangle="+(0.5f*h*b));
	}
	
	public void rect(float l,float b)
	{
		System.out.println("Area of rectangle="+(l*b));
	}
	
	public void cylinder(float r,float h)
	{
		System.out.println("Area of Cylinder="+(2*pi*r*h + 2*pi*r*r));
	}
}
class demo{
	public static void main(String ab[]){
	Scanner sc=new Scanner(System.in);
	int ch,n;
	float r,h,b,l;
	check ob=new check();
	do{
	System.out.println("\nMenu:-\n1=Reverse of number\n2=Sum of digits of number");
	System.out.println("3=Check number is perfect or not\n4=Check number is prime or not");
	System.out.println("5=Factorial of number");
	System.out.println("6=Area of Circle\n7=Area of spehere\n8=Area of Triangle");
	System.out.println("9=Area of Rectangle\n10=Area of Cylinder");
	System.out.println("Enter the choice=");
	ch=sc.nextInt();
	switch(ch){
		case 1:System.out.println("Enter the Number=");
		       n=sc.nextInt();
			   ob.reverse(n);
			   break;
		case 2:System.out.println("Enter the Number=");
			   n=sc.nextInt();
		   	   ob.sum_of_digit(n);
			   break;
		case 3:System.out.println("Enter the Number=");
			   n=sc.nextInt();
			   ob.perfect(n);
			   break;
		case 4:System.out.println("Enter the Number=");
	 		   n=sc.nextInt();
  		       ob.prime(n);
			   break;
		case 5:System.out.println("Enter the Number=");
			   n=sc.nextInt();
			   ob.factorial(n);
			   break;
		case 6:System.out.println("Enter the radius=");
			   r=sc.nextFloat();
			   ob.circle(r);
			   break;
		case 7:System.out.println("Enter the Radius=");
			   r=sc.nextFloat();
			   ob.spehere(r);
			   break;
		case 8:System.out.println("Enter the height and bredth=");
			   h=sc.nextFloat();
			   b=sc.nextFloat();
			   ob.triangle(h,b);
			   break;
		case 9:System.out.println("Enter the length and width=");
			   l=sc.nextFloat();
			   b=sc.nextFloat();
			   ob.rect(l,b);
			   break;
		case 10:System.out.println("Enter the Radius And Height=");
   			   r=sc.nextFloat();
			   h=sc.nextFloat();
			   ob.cylinder(r,h);
			   break;
		case 11:System.exit(0);
			   sc.close();
		}
	}while(ch<12);
	}
}
