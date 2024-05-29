import java.util.Scanner;
class tabel{
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Table Do you Want");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+"x"+i+"="+i*j+"\t\t");
            }
            System.out.println("");
        }
    }
}