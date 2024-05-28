//bno,bname,qty
import java.util.*;
class book{
    int bno,qty;
    String bname;
    void accept(int bno,String bname,int qty){
        this.bno=bno;
        this.bname=bname;
        this.qty=qty;
    }
    void display(){
        System.out.println(bno+"\t"+bname+"\t"+qty);
    }
    public static void main(String abc[]){
         Scanner sc=new Scanner(System.in);
         book ob[]=new book[10];
         System.out.println("Enter limit=");
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             ob[i]=new book();
             System.out.println("Enter Book no");
             int bno=sc.nextInt();
             System.out.println("Enter Book Name=");
             String bname=sc.next();
             System.out.println("Enter Book Quantity");
             int qty=sc.nextInt();
             ob[i].accept(bno,bname,qty);
         }
    }
}