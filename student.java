import java.util.*;
class Student
{
    int rno,m1,m2,m3,m4,m5,m6,t;
    float percentage;
    String name;
    void accept()
    {
        System.out.println("Enter Student Roll no=");
        Scanner sc=new Scanner(System.in);
        rno=sc.nextInt();
        System.out.println("Enter Student Name=");
        name=sc.next();
        System.out.println("Enter Six Subject Marks=");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
    }
    void calculate()
    {
        t=m1+m2+m3+m4+m5+m6;
        percentage=(float)t/6;
    }
    void display()
    {
        System.out.println("Student Roll no="+rno);       
        System.out.println("Student Name="+name);
        System.out.println("Total Marks="+t);
        System.out.println("Percentage="+percentage);
    }
    public static void main(String arg[])
    {
        Student ob=new Student();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}