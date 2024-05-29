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
        System.out.println("Enter 2nd Matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix Addition=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.err.print("\n");
        }
        
    }
}