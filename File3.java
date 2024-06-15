import java.io.*;
import java.util.*;
class demo{
	public static void main(String abc[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the File Name=");
		String s1=sc.next();
		FileInputStream f1=new FileInputStream(s1);
		int a=0,d=0,sp=0;
		while(true){
			int k=f1.read();
			if(k==-1)
			break;
			
			if(k==' ')
			sp++;
			if((k>='A' && k<='Z')||(k>='a' && k<='z'))
			a++;
			if((k>='0' && k<='9'))
			d++;
		}
		f1.close();
		
		System.out.println("Alphabets count="+a);
		System.out.println("Spaces count="+sp);
		System.out.println("Digits count="+d);
	}
}
