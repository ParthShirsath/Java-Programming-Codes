import java.util.*;
interface I1{
	void area();
	Scanner sc=new Scanner(System.in);
}
class rectangle implements I1{
	public void area(){
	System.out.println("Enter the value of length and breadth");
	float l=sc.nextFloat();
	float b=sc.nextFloat();
	float r=l*b;
	System.out.println("Area of rectangle="+r);
	}
}
class square extends rectangle implements I1{
	public void area(){
	System.out.println("Enter the value of Side of Square=");
	float n=sc.nextFloat();
	float s=n*n;
	System.out.println("Area of square="+s);
	}
}
class circle implements I1{
	public void area(){
	System.out.println("Enter the value of Radius=");
	float r=sc.nextFloat();
	float a=3.14f*r*r;
	System.out.println("Area of circle="+a);
	}
}
class demo{
	public static void main(String ab[])	
	{
		circle ob1=new circle();
		square ob2=new square();
		rectangle ob3=new rectangle();
		ob1.area();
		ob2.area();
		ob3.area();
	}
}
