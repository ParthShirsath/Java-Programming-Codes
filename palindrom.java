import java.lang.*;
import java.util.*;
class palindrom
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String=");
        String s1=sc.next();
        StringBuffer name=new StringBuffer(s1);
        StringBuffer s2=new StringBuffer(name);
        StringBuffer s3=name.reverse();

        if(s2.compareTo(s3)==0)
        System.out.println("String is palindrome");
        else
        System.out.println("String is not palindrome");
    }
}