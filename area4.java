import java.util.*;
interface I1{
	void area();
	Scanner sc=new Scanner(System.in);
}
class rectangle implements I1{
	float l,b;
	public void area(){
		System.out.println("Enter The Length and breadth of rectangle=");
		l=sc.nextFloat();
		b=sc.nextFloat();	
		System.out.println("Area of rectangle="+(l*b));
	}
}

class square extends rectangle implements I1{
	float n,a;
	Scanner sc=new Scanner(System.in);
	public void area(){
		System.out.println("Enter The side of square=");
		float s=sc.nextFloat();
		a=s*s;
		System.out.println("Area of Square="+a);
		super.area();
	}
}
class circle implements I1{
	float r,a;
	Scanner sc=new Scanner(System.in);
	public void area(){
	System.out.println("Enter The Radius of circle=");
		float r=sc.nextFloat();
		a=3.14f*r*r;
		System.out.println("Area of circle="+a);	
	}
}
class demo{
	public static void main(String abc[]){
		square ob1=new square();
		ob1.area();	
		circle ob2=new circle();
		ob2.area();
	}
}
