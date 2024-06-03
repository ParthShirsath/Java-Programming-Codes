class arthimetic{
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	int mul(int a,int b)
	{
		return a*b;
	}
	float div(float a,float b)
	{
		return a/b;
	}
	public static void main(String abc[])
	{
		int a=Integer.parseInt(abc[0]);
		int b=Integer.parseInt(abc[1]);
		
		arthimetic ob=new arthimetic();
		ob.add(a,b);
		System.out.println("Addition="+ob.add(a,b));
		ob.add(a,b);
		System.out.println("Substraction="+ob.sub(a,b));
		ob.add(a,b);
		System.out.println("Multiplication="+ob.mul(a,b));
		ob.add(a,b);
		System.out.println("Division="+ob.div(a,b));
	}
}