import java.util.*;
abstract class staff{
    String name,address;
    abstract void disp();
}
class fullTimeStaff extends staff{
    String dept;
    float sal;
    fullTimeStaff(String name,String address,String dept,float sal){
        this.name=name;
        this.address=address;
        this.dept=dept;
        this.sal=sal;
    }
    void disp(){
        System.out.println("\nName="+name);
        System.out.println("Address="+address);
        System.out.println("Department="+dept);
        System.out.println("Salary="+sal);
    }
}

class partTimeStaff extends staff{
    int hours,rate;
    partTimeStaff(String name,String address,int hours,int rate){
        this.name=name;
        this.address=address;
        this.hours=hours;
        this.rate=rate;
    }
    void disp(){
        System.out.println("\nName="+name);
        System.out.println("Address="+address);
        System.out.println("No of Hours="+hours);
        System.out.println("Rate per hour="+rate);
        System.out.println("Salary="+(hours*rate));
    }
}
public class menu1 {
    public static void main(String abc[]) {
        int ch, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit=");
        n = sc.nextInt();
        fullTimeStaff ob[] = new fullTimeStaff[n];
        partTimeStaff ob1[] = new partTimeStaff[n];
        do {
            System.out.println("Menu:-\n1-Full Time Staff\n2-Part Time Staff\nEnter The Choice=");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the name=");
                        String name = sc.next();
                        System.out.println("Enter the Address=");
                        String add = sc.next();
                        System.out.println("Enter the Department=");
                        String dept = sc.next();
                        System.out.println("Enter the salary=");
                        float sal = sc.nextFloat();
                        ob[i] = new fullTimeStaff(name, add, dept, sal);
                    }
                    for (int i = 0; i < n; i++) {
                        ob[i].disp();
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter the name=");
                        String name = sc.next();
                        System.out.println("Enter the Address=");
                        String add = sc.next();
                        System.out.println("Enter the Number of Hours=");
                        int hr = sc.nextInt();
                        System.out.println("Enter the salary=");
                        int rate = sc.nextInt();
                        ob1[i] = new partTimeStaff(name, add, hr, rate);
                    }
                    for (int i = 0; i < n; i++) {
                        ob[i].disp();
                    }
            }
        }while(ch<3);
    }
}

