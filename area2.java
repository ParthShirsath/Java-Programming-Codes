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
	public void area(){
	
	}
	square(float s,float l,float b){
		super(l,b);
		System.out.println("Area of Square="+(s*s));
	}
}
class circle implements I1{
	public void area(){
	
	}
	circle(float r){
		System.out.println("Area of circle="+(3.14f*r*r));	
	}
}
class demo{
	public static void main(String abc[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The side of square=");
		float s=sc.nextFloat();
		
		System.out.println("Enter The Length and breadth of rectangle=");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		
		square ob1=new square(s,l,b);
		
		System.out.println("Enter The Radius of circle=");
		float r=sc.nextFloat();
		circle ob2=new circle(r);
		
	}
}
