import java.util.*;
class Area
{
    float area;
    void circle(float r)
    {
        area=3.14f*r*r;
        System.out.println("Area of circle="+area);
    }
    void rectangle(float l,float b)
    {
        area=l*b;
        System.out.println("Area of Reactangle="+area);
    }
    void square(float s)
    {
        area=s*s;
        System.out.println("Area of Square="+area);
    }
    public static void main(String[] args) {
        Area ob=new Area();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side of Square=");
        Float s=sc.nextFloat();
        ob.square(s);
        System.out.println("Enter Radius of circle=");
        Float r=sc.nextFloat();
        ob.circle(r);
        System.out.println("Enter lenght and breadth of Rectangle=");
        Float l=sc.nextFloat();
        Float b=sc.nextFloat();
        ob.rectangle(l,b);
    }
}