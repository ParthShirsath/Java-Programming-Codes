import java.util.*;
import java.lang.Character;
class InvalidNameExeption extends Exception{
	public String toString(){
		return "Invalid name.....!!";
	}
}

class Name{
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name=");
		String name=sc.next();
		int i;
		
		for(i=0;i<name.length();i++)
		{
			if(!Character.isAlphabetic(name.charAt(i)))
			throw new InvalidNameExeption();
		}
		System.out.println("Name="+name);
		
	}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
