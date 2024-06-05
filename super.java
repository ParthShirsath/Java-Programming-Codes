import java.util.*;
class circle{
	Scanner sc=new Scanner(System.in);
	float r;
	void area(){
	System.out.println("Enter radius for circle=");
	r=sc.nextFloat();
	float c=(3.14f*r*r);
	System.out.println("Area of Circle="+c);
	}
}
class cylinder extends circle{
	cylinder(){
	System.out.println("Enter Cylinder radius=");
	float r=sc.nextFloat();
	System.out.println("Enter Cylinder Height=");
	float h=sc.nextFloat();
	float c=(2*3.14f*r*h) + (2*3.14f*r*r);
	System.out.println("Cylinder area="+c);
	super.area();
	}
}
class demo{
	public static void main(String abc[]){
	cylinder ob=new cylinder();
}
}
