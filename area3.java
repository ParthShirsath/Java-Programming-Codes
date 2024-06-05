import java.util.*;
interface I1{
	void area();
}
class rectangle implements I1{
	public void area(){
	
	}
	rectangle(float l,float b){
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
	}
	square(float l,float b){
		super(l,b);
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
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter The Length and breadth of rectangle=");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		
		square ob1=new square(l,b);
		ob1.area();
		
		circle ob2=new circle();
		ob2.area();
	}
}
