import java.util.*;
class college{
	Scanner sc=new Scanner(System.in);
	int cno;
	String cname,cadd;
	void acceptc(){
		System.out.println("\nEnter the College number=");
		cno=sc.nextInt();
		System.out.println("Enter the College name=");
		cname=sc.next();
		System.out.println("Enter the College Address=");
		cadd=sc.next();
	}
	void dispc()
	{
		System.out.println("\nCollege number="+cno);
		System.out.println("College name="+cname);
		System.out.println("College address="+cadd);	
	}
}
class Student extends college{
	int rno;
	String sname;
	float per;
	Scanner sc=new Scanner(System.in);
	void accept(){
		System.out.println("\nEnter the Student Roll number=");
		rno=sc.nextInt();
		System.out.println("Enter the Student name=");
		sname=sc.next();
		System.out.println("Enter the Student Percentage=");
		per=sc.nextFloat();
	}
	
	void disp()
	{
		System.out.println("\nStudent Roll number="+rno);
		System.out.println("Student name="+sname);
		System.out.println("Student percentage="+per);
	}
}

class teacher extends college{
	int tno;
	String tname;
	float sal;
	Scanner sc=new Scanner(System.in);
	void accept(){
		System.out.println("\nEnter the Teacher number=");
		tno=sc.nextInt();
		System.out.println("Enter the Teacher name=");
		tname=sc.next();
		System.out.println("Enter the Teacher Salary=");
		sal=sc.nextFloat();
	}
	void disp()
	{
		System.out.println("\nTeacher number="+tno);
		System.out.println("Teacher name="+tname);
		System.out.println("Teacher Salary="+sal);
	}
}

class demo{
	public static void main(String ab[]){
		Student ob1=new Student();
		teacher ob2=new teacher();
		ob1.acceptc();
		ob1.dispc();
		
		ob1.accept();
		ob1.disp();

		ob2.acceptc();
		ob2.dispc();
		
		ob2.accept();
		ob2.disp();
	}
}
