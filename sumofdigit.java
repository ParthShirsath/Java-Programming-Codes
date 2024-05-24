import java.util.*;
class sumofdigit{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number");
    int num=sc.nextInt();
    int s=0,d;
    while(num>0)
    {
        d=num%10;
        s=s+d;
        num=num/10;
    }
    System.out.println("Sum of Digit="+s);
    }
}