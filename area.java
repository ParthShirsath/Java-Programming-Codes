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
        ob.square(5.5f);
        ob.circle(4.5f);
        ob.rectangle(2.2f,4.8f);
    }
}