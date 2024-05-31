import java.util.*;
class demo
{
    public static void main(String []a)
    {
        String s1=new String();
        StringBuffer s2=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String=");
        s1=sc.next();
        s2=new StringBuffer(s1);
        System.out.print("\nString display=");
        System.out.println(s2);       
    }
}