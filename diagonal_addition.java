import java.util.*;
class demo{
    public static void main(String abc[])
    {
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The number of row and column=");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter 1st Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                sum=sum+a[i][j];
            }
        }
        System.out.println("Diagonal entrys Sum="+sum);
    }
}