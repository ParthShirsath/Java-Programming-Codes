/*create abstract class shape with abstract method area.write a java program to calculate are of Rectangle and Triangle Inherit shape class in classes Recfangle and triangle.*/
import java.util.*;
abstract class shape{
	abstract void area();
	Scanner sc=new Scanner(System.in);
}
class rectangle extends shape{
	void area(){
	System.out.println("Enter Length and breadth=");
	float l=sc.nextFloat();
	float b=sc.nextFloat();
	System.out.println("Area of rectangle"+l*b);
	}
}
class triangle extends shape{
	void area(){
	System.out.println("Enter Height and breadth=");
	float b=sc.nextFloat();
	float h=sc.nextFloat();
	System.out.println("Area of Triangle"+0.5*b*h);
	}
}
class demo{
	public static void main(String ab[]){
	rectangle ob1=new rectangle();
	triangle ob2=new triangle();	
	ob1.area();
	ob2.area();
	}
}
