import java.util.*;

class NumberIsSmall extends Exception{
	public String toString(){
		return "Number is Small";
	}
}

class NumberIsGreater extends Exception{
	public String toString(){
		return "Number is Greater";
	}
}
class number{
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number=");
		int n=sc.nextInt();
		if(n<5)
		throw new NumberIsSmall();
		else if(n>10)
		throw new NumberIsGreater();
		
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		System.out.println("Factorial of Number="+f);
		}
		catch(NumberIsSmall e1){
			System.out.println(e1);
		}
		
		catch(NumberIsGreater e2){
			System.out.println(e2);
		}
	}
}
