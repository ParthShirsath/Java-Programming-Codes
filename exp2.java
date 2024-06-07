import java.util.*;
class NumberIsOutOfRangeException extends Exception{
	public String toString(){
		return "Number is out of Range";
	}
}
class number{
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number=");
		int n=sc.nextInt();
		if(n>100)
		throw new NumberIsOutOfRangeException();
		
		int s=0,d;
		while(n>0){
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("Sum of the Digit="+s);
	}
	catch(NumberIsOutOfRangeException e){
		System.out.println(e);
	}
	catch(Exception e1){
		System.out.println("Error");
	}
}
}
