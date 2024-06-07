import java.util.*;
class NumberisZeroException extends Exception{
	public String toString(){
		return "Number is Zero";
	}
}
class number{
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number=");
		int n=sc.nextInt();
		if(n==0)
		throw new NumberisZeroException();
		
		int n1=n,s=0,d;
		while(n>0){
			d=n%10;
			s=(s*10)+d;
			n=n/10;
		}
		if(s==n1)	
		System.out.println("Number is Palindrome");
		else
		System.out.println("Number is not Palindrome");
	}
		catch(NumberisZeroException e1){
		System.out.println(e1);
	}
		catch(Exception e){
		System.out.println("Number is Invalid");
	}
}
}

