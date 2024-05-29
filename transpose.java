import java.util.*;
class demo{
    public static void main(String abc[])
    {
        int a[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The number of row and column=");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter Matrix");
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
                System.out.print(a[j][i]+"\t");
            }
            System.out.println("");
        }
    }
}