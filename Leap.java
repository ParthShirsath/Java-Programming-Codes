import java.util.*;
class leap
{
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The year=");
        int year=sc.nextInt();
        if(year%4==0)
        System.out.print("It is the LeapYear");
        else
        System.out.print("It is Not the LeapYear");
    }
}