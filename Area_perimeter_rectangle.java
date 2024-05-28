import java.util.*;
class Area_peri
{
    void perimeter(float l,float b)
    {
        System.out.println("Perimeter of rectangle="+2*(l+b));
    }
    void area(float l,float b)
    {
        System.out.println("Perimeter of rectangle="+(l*b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter The Value of Lenght and Breadth=");
        Float l=sc.nextFloat();
        Float b=sc.nextFloat();
        Area_peri ob=new Area_peri();
        ob.perimeter(l,b);
        ob.area(l,b);
    }
}