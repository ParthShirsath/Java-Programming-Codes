import java.util.*;
class MinMax{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number");
        int n2=sc.nextInt();
        System.out.println("Enter Third Number");
        int n3=sc.nextInt();
        if(n1 > n2 && n1 >n3)
        System.out.println("First Number is Maximum");       

        if(n2 > n1 && n2 >n3)
        System.out.println("Second Number is Maximum");       

        if(n3 > n1 && n3 >n2)
        System.out.println("Third Number is Maximum"); 

        if(n1 < n2 && n1 < n3)
        System.out.println("First Number is Minimum");       

        if(n2 < n1 && n2 < n3)
        System.out.println("Second Number is Minimum");       

        if(n3 < n1 && n3 < n2)
        System.out.println("Third Number is Minimum");  
    }
}