import java.util.*;
class college{
	int cno;
	String cname,cadd;
	void acceptc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the college number=");
		cno=sc.nextInt();
		System.out.println("Enter the college name=");
		cname=sc.next();
		System.out.println("Enter the college address=");
		cadd=sc.next();
	}
}
class student extends college{
	int rno;
	String sname;
	float per;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Roll number=");
		rno=sc.nextInt();
		System.out.println("Enter the Student name=");
		sname=sc.next();
		System.out.println("Enter the Student percentage=");
		per=sc.nextFloat();
	}
	void disp()
	{
		System.out.println("Student Roll number="+rno);
		System.out.println("Student name="+sname);
		System.out.println("Student percentage="+per);
		System.out.println("\nCollege number="+cno);
		System.out.println("College name="+cname);
		System.out.println("College Address="+cadd);
	}
}
class demo{
	public static void main(String abc[])
	{
		student ob=new student();
		ob.acceptc();
		ob.accept();
		ob.disp();
	}
}
