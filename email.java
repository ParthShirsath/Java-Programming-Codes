import java.util.*;
import java.lang.Character;
class InvalidEmailException extends Exception{
	public String toString(){
		return "Invalid Email.....!!";
	}
}

class Email{
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email=");
		String email=sc.next();
		int i,f=0;
		
		for(i=0;i<email.length();i++)
		{
			if(email.charAt(i)=='@')
			f=1;
		}
			if(f==0)
			throw new InvalidEmailException();
			
		System.out.println("Email="+email);
		
	}
		catch(InvalidEmailException e){
			System.out.println(e);
		}
	}
}
