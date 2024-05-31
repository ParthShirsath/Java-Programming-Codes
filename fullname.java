import java.lang.*;
import java.util.*;
class fullname{
    void disp(String m)
    {
        for(int i=0;i<m.length();i++)
        {
            if(i==0)
            System.out.print(Character.toUpperCase(m.charAt(i)));
            else
            System.out.print(m.charAt(i));
        }
        System.out.print(" ");
    }
    public static  void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        fullname ob=new fullname();
        String s1=new String();
        System.out.print("Enter The Name in the form of(first name-middle name-last name=");
        s1=sc.nextLine();

        
        String s2[]=s1.split(" ");
        String m;
        m=s2[2];
        ob.disp(m);
        m=s2[0];
        ob.disp(m);
        m=s2[1];
        ob.disp(m);        
    }
}