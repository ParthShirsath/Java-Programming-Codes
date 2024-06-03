interface Integer{
	void check(int num);
}
class positive_negative implements Integer{
	public void check(int num){
		if(num>0)
		System.out.println(num+" is Positive");
		else if(num<0)
		System.out.println(num+" is negative");
	}
}
class demo{
	public static void main(String ab[]){
		positive_negative ob=new positive_negative();
		ob.check(4);
		ob.check(-4);
		
	}
}
