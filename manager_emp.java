import java.util.*;
class employee{
	int id;
	String name,dept;
	float sal;
	Scanner sc=new Scanner(System.in);
	employee(){
		id=1011;
		name="om";
		dept="IT";
		sal=33553;
	}
	employee(int id,String name,String dept,float sal){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	void accepte(){
		System.out.println("Enter the Id=");
		id=sc.nextInt();
		System.out.println("Enter the name=");
		name=sc.next();
		System.out.println("Enter the dept=");
		dept=sc.next();
		System.out.println("Enter the Salary=");
		sal=sc.nextFloat();
	}
	void dispe(){
		System.out.println("\nId="+id);
		System.out.println("Name="+name);
		System.out.println("Department="+dept);
		System.out.println("Salary="+sal);
	}
}
class manager extends employee{
	float bonus;
	void accept(){
		System.out.println("Enter the bonus=");
		bonus=sc.nextFloat();
	}
	void disp(){
		System.out.println("bonus="+bonus);
	}
}
class demo{
	public static void main(String ab[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The limit=");
	int n=sc.nextInt();
	manager ob[]=new manager[n];
	for(int i=0;i<n;i++){
		ob[i]=new manager();
		ob[i].accepte();
		ob[i].accept();
	}
	int index=0;
	float max=ob[0].sal+ob[0].bonus;
	for(int i=0;i<n;i++)
	{
		if(ob[i].sal+ob[i].bonus>max)
		{
		max=ob[i].sal+ob[i].bonus;
		index=i;
		}
	}
	ob[index].dispe();
	ob[index].disp();
	}	
}
