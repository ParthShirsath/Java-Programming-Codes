import java.util.*;
class program1
{
    public static void main(String abc[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number for table");
        int n=sc.nextInt();
        System.out.print("Multiplication Table\n");
        for(i=1;i<=10;i++)
        {
            System.out.println(""+i*n);
        }
    }
}