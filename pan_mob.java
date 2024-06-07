import java.util.*;
import java.lang.Character;
class InvalidDataException extends Exception{
	public String toString(){
		return "Invalid Pan Number or Mobile Number";
	}
}
class demo{
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pan Number=");
		String pan=sc.next();
		int i;
		
		if(pan.length()>10)
			throw new InvalidDataException();
			
		if(pan.length()<10)
			throw new InvalidDataException();
			
		for(i=0;i<4;i++)
		{
			if(!(Character.isUpperCase(pan.charAt((i)))))
				throw new InvalidDataException();
		}
		for(i=5;i<9;i++)
		{
			if(!Character.isDigit(pan.charAt(i)))
				throw new InvalidDataException();
		}
		if(!Character.isUpperCase(pan.charAt(i)))
			throw new InvalidDataException();
		System.out.println("Your Pan Number="+pan);
		
		System.out.println("Enter the Mobile Number=");
		String mobile=sc.next();
		if(mobile.length()>10)
			throw new InvalidDataException();
			
		if(mobile.length()<10)
			throw new InvalidDataException();
			
		for(i=0;i<10;i++)
		{
			if(!Character.isDigit(mobile.charAt(i)))
				throw new InvalidDataException();
		}
		System.out.println("Your Mobile Number="+mobile);
	}
	
		catch(InvalidDataException e){
		System.out.println(e);
	}
	}
}
