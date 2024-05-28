import java.util.*;
class Demo
{
    int i;
    void factorial(int n)
    {
        int sum=1;
        for(i=1;i<=n;i++)
        {
            sum=sum*i;
        }
    System.out.println("Factorial="+sum);
    }
    void perfect(int n)
    {
        int sum=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        System.out.println("Number is perfect");
        else
        System.out.println("Number is not perfect");
    }
    void prime(int n)
    {
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
        if(i==n)
        System.out.println("Number is prime");        
        else
        System.out.println("Number is not prime");
    }
    void armstrong(int n)
    {
        int n1=n,s=0,d;
        while(n>0)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(n1==s)
        System.out.println("Number is Armstrong");
        else
        System.out.println("Number is not Armstrong");
    }
    public static void main(String abc[])
    {
        Demo ob=new Demo();
        int num;
        Scanner sc=new Scanner(System.in);
        do { 
            
            System.out.print("\nEnter Number=");
            num=sc.nextInt();

            System.out.println("Menu:-\n1-Factorial of given number\n2:-check number is perfect or not");
            System.out.println("3:-check number is prime or not\n4:-check number is Armstrong or not");
            System.out.println("Enter The Choice=");
            int c=sc.nextInt();
            switch(c)
            {
                case 1:ob.factorial(num);
                       break;
                case 2:ob.perfect(num);
                       break;
                case 3:ob.prime(num);
                       break;
                case 4:ob.armstrong(num);
                       break;
            }
        } while (true);
    }
}