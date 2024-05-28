import java.util.*;
class product{
    int pid,qty;
    String pname;
    float price;
    static float total_amount;
    void accept(int pid,String pname,float price,int qty)
    {
        this.pid=pid;
        this.pname=pname;
        this.price=price;
        this.qty=qty;
    }
    void display()
    {
        System.out.println(pid+"\t"+pname+"\t"+price+"\t"+qty);
    }
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Limit=");
        int n=sc.nextInt();
        product ob[]=new product[10];
        for(int i=0;i<n;i++)
        {
            ob[i]=new product();
            System.out.println("Enter Product ID");
            int pid=sc.nextInt();
            System.out.println("Enter Product Name=");
            String pname=sc.next();
            System.out.println("Enter Product price");
            Float price=sc.nextFloat();
            System.out.println("Enter Product Quantity");
            int qty=sc.nextInt();
            ob[i].accept(pid,pname,price,qty);
        }
        for(int i=0;i<n;i++)
        {
            total_amount=(float)total_amount+(ob[i].price*ob[i].qty);
        }
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
        System.out.println("\tTotal amount="+total_amount);
    }
}