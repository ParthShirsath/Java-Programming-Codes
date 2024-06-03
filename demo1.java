interface I1{
	void add(int a,int b);
	void square(int n);
}
class Demo implements I1{
	public void add(int a,int b)
	{
		System.out.println("Addition="+a+b);
	}
	public void square(int n)
	{
		System.out.println("Square of number="+n*n);
	}
}
class Mdemo{
	public static void main(String abc[])
	{
		Demo ob=new Demo();
		ob.add(44,77);
		ob.square(67);
	}
}
