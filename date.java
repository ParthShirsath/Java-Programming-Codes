import java.util.*;
class InvalidDateExeption extends Exception{
	public String toString(){
		return "Invalid Date";
	}
}

class Mydate{
	Scanner sc=new Scanner(System.in);
	int date,month,year;
	void accept(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;	
	}
	void disp(){
		System.out.println("Date="+date+"/"+month+"/"+year);
	}
	
	public static void main(String abc[]){
	try{
		Scanner sc=new Scanner(System.in);
		int date,month,year;
		System.out.println("Enter the Date in dd/mm/yyyy format=");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		Mydate ob=new Mydate();
		ob.accept(date,month,year);
		
		int f=0;
		if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && (date<=31)){
		ob.disp();
		f=1;
		}
		
		else if((month==4 || month==6 || month==7 || month==9 || month==11) && (date<=30)){
		ob.disp();
		f=1;
		}
		else if(year%4==0) 
		{
			if(month==2 && date<=29){
			ob.disp();
			f=1;
			}
		}
		else if(month==2 && date<=28){
		ob.disp();
		f=1;
		}
		if(f==0)
		throw new InvalidDateExeption();
		
	}
		catch(InvalidDateExeption e){
		System.out.println(e);
	}
}
}
