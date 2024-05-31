import java.util.*;
class count{
    public static void main(String abc[])
    {
        int a[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit=");
        int n=sc.nextInt();
        System.out.println("Enter n numbers=");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
   
        int c[]=new int[100];
        for(int i=0;i<c.length;i++)
        {
            c[i]=0;
        }
        for(int i=0;i<c.length;i++)
        {
            c[a[i]]++;
        }
        for(int i=1;i<c.length;i++)
        {
            if(c[i]!=0)
            System.out.println("\n"+i+"present="+c[i]+"times");
        }
    }
}