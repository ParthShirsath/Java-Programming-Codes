interface shape{
	void area_circle(float r);
	void area_spehere(float r);
	final float pi=3.14f;
}
class area implements shape{
	public void area_circle(float r){
		float area=pi*r*r;
		System.out.println("Area of Circle="+area);
	}
	
	public void area_spehere(float r){
	float area=4*pi*r*r;
		System.out.println("Area of Spehere="+area);
	}
}
class demo{
	public static void main(String ab[]){
		area ob=new area();
		ob.area_circle(2.11f);
		ob.area_spehere(3.56f);
	}
}
