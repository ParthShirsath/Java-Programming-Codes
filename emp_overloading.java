import java.util.*;
class emp{
    int id,age;
    String name,gender;
    emp()
    {
        id=1;
        name="om";
        age=34;
        gender="MALE";
    }
    emp(int id,String name,int age,String gender)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    void disp()
    {
        System.out.println("Employee Id="+id);
        System.out.println("Employee Name="+name);
        System.out.println("Employee Age="+age);
        System.out.println("Employee Gender="+gender);
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        emp ob[]=new emp[10];
        for(int i=0;i<5;i++)
        {
        System.out.print("\nEnter The Emp Id=");
        int id=sc.nextInt();
    
        System.out.print("Enter The Emp Name=");
        String name=sc.next();
    
        System.out.print("Enter The Emp Age=");
        int age=sc.nextInt();
    
        System.out.print("Enter The Emp Gender=");
        String gen=sc.next();

        ob[i]=new emp(id,name,age,gen);
        }
        System.out.println("\n\n");
        for(int i=0;i<5;i++)
        {
            ob[i].disp();
        }
        
    }
}