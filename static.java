import java.util.*;
class area{
    static void circle(float r)
    {
        System.out.println("Area of circle="+3.14f*r*r);
    }
    void rectangle(float l,float b)
    {
        System.out.println("Area of rectangle="+l*b);
    }
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        area ob=new area();
        System.out.println("Enter The Length and breadth=");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        ob.rectangle(l,b);

        System.out.println("Enter The Radius=");
        float r=sc.nextFloat();
        circle(r);
    }
}