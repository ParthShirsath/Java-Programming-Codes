import java.util.*;
class continent{
	Scanner sc = new Scanner(System.in);
	String conti,contr,s;
	void acceptc(){
	System.out.println("Enter the Continent name");
	conti=sc.next();
	}
}
class country extends continent{
	Scanner sc = new Scanner(System.in);
	void acceptcont(){
	System.out.println("Enter the Country name");
	contr=sc.next();
	}
}
class state extends country{
	Scanner sc = new Scanner(System.in);
	void accepts(){
	System.out.println("Enter the State name");
	s=sc.next();
	}
	void disp()
	{
		System.out.println("\nContinent name="+conti);
		System.out.println("Country name="+contr);
		System.out.println("State name="+s);
		System.out.println("Place name=trimbkeshwar");
	}
}
class demo{
	public static void main(String abc[])
	{
		state ob=new state();
		ob.acceptc();
		ob.acceptcont();
		ob.accepts();
		ob.disp();
	}
}
