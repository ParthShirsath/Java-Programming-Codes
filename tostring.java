import java.util.*;
class student{
	int rno;
	String name;
	static int cnt=0;
	student(){
	rno=101;
	name="om";
	}
	student(int rno,String name){
	cnt++;
	this.rno=rno;
	this.name=name;
	}
	public String toString(){
	return "\nObject count="+cnt+"\nRoll no="+rno+"\nName="+name;
	}
}
class demo{
	public static void main(String abc[]){
		Scanner sc=new Scanner(System.in);
		student ob[]=new student[100];
		do{
		for(int i=0;i<ob.length;i++){
			System.out.println("\nEnter Roll no=");
			int rno=sc.nextInt();
			System.out.println("Enter name=");
			String name=sc.next();
			ob[i]=new student(rno,name);
			System.out.println(ob[i]);
			}
		}while(true);
	}
}
