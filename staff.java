import java.util.*;
abstract class staff{
	int id;
	String name;
	staff(int id,String name){
		this.id=id;
		this.name=name;
	}
}

class officestaff extends staff{
	String dept;
	officestaff(int id,String name,String dept){
		super(id,name);
		this.dept=dept;
	}
	void disp(){
	System.out.println("\nId="+id);
	System.out.println("Name="+name);
	System.out.println("Department name="+dept);
	}
}
class demo{
	public static void main(String ab[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The limit=");
	int n=sc.nextInt();
	officestaff ob[]=new officestaff[n];
	
	for(int i=0;i<n;i++){
	System.out.println("Enter The Id=");
	int id=sc.nextInt();
	System.out.println("Enter The Name=");
	String name=sc.next();
	System.out.println("Enter The Department=");
	String dept=sc.next();
	ob[i]=new officestaff(id,name,dept);
	}
	for(int i=0;i<n;i++)
	{
		ob[i].disp();
	}
}
}
