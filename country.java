import java.util.*;
class country{
    public static void main(String s1[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit=");
        int n=sc.nextInt();
        String c[]=new String[n];
        System.out.println("Enter country names=");
        for(int i=0;i<n;i++)
        {
            c[i]=sc.next();
        }
        String temp;
        int pass,i;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(c[i].compareTo(c[i+1])>0)
                {
                    temp=c[i];
                    c[i]=c[i+1];
                    c[i+1]=temp;
                }
            }
        }
        System.out.println("\nSorted Country name=");
        for(i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
    }
}