import java.util.*;
class Emp
{
    int id;
    String name,department;
    float sal;
    static int c=0;
    Emp(int no,String ename,String dept,float sal)
    {
        c++;
        this.id=no;
        this.name=ename;
        this.department=dept;
        this.sal=sal;
    }
    void disp()
    {
        System.out.println("\nEmployee Count="+c);
        System.out.println("Employee Id="+id);
        System.out.println("Employee Name="+name);
        System.out.println("Employee Department="+department);
        System.out.println("Employee Salary="+sal);    
    }
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("\nEnter The Emp Id=");
        int id=sc.nextInt();
    
        System.out.print("Enter The Emp Name=");
        String name=sc.next();
    
        System.out.print("Enter The Emp Department=");
        String dept=sc.next();
    
        System.out.print("Enter The Emp salary=");
        Float sal=sc.nextFloat();

        Emp ob=new Emp(id,name,dept,sal);
        ob.disp();
        }while(true);
    }
}